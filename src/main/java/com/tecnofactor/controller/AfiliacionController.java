package com.tecnofactor.controller;


import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.tecnofactor.exception.ResourceNotFoundException;
import com.tecnofactor.model.Afiliacion;
import com.tecnofactor.model.Asegurado;
import com.tecnofactor.model.Poliza;
import com.tecnofactor.model.Vehiculo;
import com.tecnofactor.model.contract.AfiliacionErrorContract;
import com.tecnofactor.model.contract.AfiliacionOKContract;
import com.tecnofactor.model.dto.VehiculoDTO;
import com.tecnofactor.service.AfiliacionService;
import com.tecnofactor.service.AseguradoService;
import com.tecnofactor.service.PolizaService;
import com.tecnofactor.service.VehiculoService;
import com.tecnofactor.service.external.VehiculosInspeccionadosService;
import com.tecnofactor.service.external.VehiculosRobadosService;

@RestController
@RequestMapping("/afiliacion")
public class AfiliacionController {

	@Autowired
	AfiliacionService afiliacionService;

	@Autowired
	PolizaService polizaService;

	@Autowired
	VehiculoService vehiculoService;

	@Autowired
	AseguradoService aseguradoService;

	@Autowired
	VehiculosInspeccionadosService vehiculosInspeccionadosService;

	@Autowired
	VehiculosRobadosService vehiculosRobadosService;

	@PostMapping("/")
	public ResponseEntity<?> crearAfiliacion(@Valid @RequestBody Afiliacion afiliacion, BindingResult bindingResult) {
		AfiliacionOKContract afiliadoContract = new AfiliacionOKContract();

		if (!bindingResult.hasErrors()) {
			try {

				validarVehiculoAutorizado(afiliacion.getVehiculo().getDsPlaca());
				validarVehiculoRobado(afiliacion.getVehiculo().getDsPlaca());
				Poliza poliza = validarPoliza(afiliacion.getPoliza());
				Vehiculo vehiculo = validarVehiculo(afiliacion.getVehiculo());
				Asegurado asegurado = validarAsegurado(afiliacion.getAsegurado());

				afiliacionService.crearAfiliacion(new Afiliacion(vehiculo, poliza, asegurado));
				afiliadoContract.setNmTransaccion(String.valueOf((int) (Math.random() * 150000) + 1));

			} catch (ResourceNotFoundException e) {
				return new ResponseEntity<AfiliacionErrorContract>(new AfiliacionErrorContract(e.getMessage()),
						HttpStatus.NOT_FOUND);
			}
		}

		return new ResponseEntity<AfiliacionOKContract>(afiliadoContract, HttpStatus.OK);
	}

	private Poliza validarPoliza(Poliza poliza) {
		Poliza polizaResult = polizaService.findByDsNumero(poliza.getDsNumero());
		if (polizaResult == null)
			throw new ResourceNotFoundException(
					String.format("La número de poliza: %s no éxiste", poliza.getDsNumero()));

		return polizaResult;

	}

	private Asegurado validarAsegurado(Asegurado asegurado) {
		Asegurado aseguradoResult = aseguradoService.findByNmDocumento(asegurado.getNmDocumento());
		if (aseguradoResult == null)
			throw new ResourceNotFoundException(
					String.format("El asegurado con el numero: %s no éxiste", asegurado.getNmDocumento()));
		return aseguradoResult;
	}

	private Vehiculo validarVehiculo(Vehiculo vehiculo) {
		Vehiculo vehiculoResult = vehiculoService.findByDsPlaca(vehiculo.getDsPlaca());
		if (vehiculoResult == null)
			throw new ResourceNotFoundException(
					String.format("El vehiculo con la placa: %s no éxiste", vehiculo.getDsPlaca()));

		return vehiculoResult;
	}

	private Optional<VehiculoDTO> validarVehiculoAutorizado(String placa) {

		Optional<VehiculoDTO> vehiculo = vehiculosInspeccionadosService.getAllVehiculosInspeccionados().stream()
				.filter(vh -> vh.getDsPlaca().equals(placa))
				.filter(vh -> vh.getInspeccionado().equals("S"))
				.findFirst();

		if (!vehiculo.isPresent()) {
			throw new ResourceNotFoundException(String.format("El vehiculo de placa %s no ésta autorizado", placa));
		}

		return vehiculo;
	}

	private Optional<VehiculoDTO> validarVehiculoRobado(String placa) {

		Optional<VehiculoDTO> vehiculo = vehiculosRobadosService.getAllVehiculosRobados().stream()
				.filter(vh -> vh.getDsPlaca().equals(placa))
				.filter(vh -> vh.getRobado().equals("S")).findFirst();
		
		if (vehiculo.isPresent()) {
			throw new ResourceNotFoundException(String.format("El vehiculo de placa %s es robado", placa));
		}

		return vehiculo;
	}
}
