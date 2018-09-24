package com.tecnofactor.service;

import java.util.Optional;

import com.tecnofactor.model.Vehiculo;

public interface VehiculoService {
	
	public Vehiculo findByDsPlaca(String dsPlaca);
}
