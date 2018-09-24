package com.tecnofactor.service.external.impl;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.tecnofactor.model.dto.VehiculoDTO;
import com.tecnofactor.service.external.VehiculosInspeccionadosService;

@Service
public class VehiculosInspeccionadosServiceImpl implements VehiculosInspeccionadosService {

	public List<VehiculoDTO> getAllVehiculosInspeccionados() {

		return Arrays.asList(new VehiculoDTO(1, "PTO 210", "CX-5", "Mazda", 4, "","S"),
				new VehiculoDTO(2, "WDX 009", "Logan", "Renault", 4, "","N"),
				new VehiculoDTO(3, "ZAQ 967", "Spark", "Chevrolet", 4, "","S"),
				new VehiculoDTO(2, "MHQ 424", "Rubicon", "Jepp", 4, "","S"));
	}
}
