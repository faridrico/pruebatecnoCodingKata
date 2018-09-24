package com.tecnofactor.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tecnofactor.model.Asegurado;

public interface AseguradoRepository extends CrudRepository<Asegurado, Integer> {
	
	public Asegurado findByNmDocumento(String nmDocumento);
}
