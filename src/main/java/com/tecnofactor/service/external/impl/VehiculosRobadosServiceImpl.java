package com.tecnofactor.service.external.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tecnofactor.model.dto.VehiculoDTO;
import com.tecnofactor.service.external.VehiculosRobadosService;

@Service
public class VehiculosRobadosServiceImpl implements VehiculosRobadosService {

	@Override
	public List<VehiculoDTO> getAllVehiculosRobados() {

		return Arrays.asList(new VehiculoDTO(1, "PTO 210", "CX-5", "Mazda", 4, "N", ""),
				new VehiculoDTO(2, "WDX 009", "Logan", "Renault", 4, "N", ""),
				new VehiculoDTO(3, "ZAQ 967", "Spark", "Chevrolet", 4, "S", ""),
				new VehiculoDTO(2, "MHQ 424", "Rubicon", "Jepp", 4, "N", ""));
	}
}
