package com.tecnofactor.service;

import java.util.Optional;

import com.tecnofactor.model.Asegurado;

public interface AseguradoService {
	
	public Asegurado findByNmDocumento(String nmDocumento);
}
