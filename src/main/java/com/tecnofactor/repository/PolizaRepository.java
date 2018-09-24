package com.tecnofactor.repository;

import org.springframework.data.repository.CrudRepository;

import com.tecnofactor.model.Poliza;

public interface PolizaRepository extends CrudRepository<Poliza, Integer> {
	public Poliza findByDsNumero(String dsNumero);
}
