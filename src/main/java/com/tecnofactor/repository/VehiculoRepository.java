package com.tecnofactor.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tecnofactor.model.Vehiculo;

public interface VehiculoRepository extends CrudRepository<Vehiculo, Integer> {
	public Vehiculo findByDsPlaca(String dsPlaca);
}
