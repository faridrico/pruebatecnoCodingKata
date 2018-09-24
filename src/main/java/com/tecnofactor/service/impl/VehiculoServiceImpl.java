package com.tecnofactor.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnofactor.model.Vehiculo;
import com.tecnofactor.repository.VehiculoRepository;
import com.tecnofactor.service.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService {

	@Autowired
	VehiculoRepository vehiculoRepository;
	
	@Override
	public Vehiculo findByDsPlaca(String dsPlaca) {
		return vehiculoRepository.findByDsPlaca(dsPlaca);
	}

}
