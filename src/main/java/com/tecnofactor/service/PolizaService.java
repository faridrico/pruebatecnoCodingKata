package com.tecnofactor.service;


import com.tecnofactor.model.Poliza;

public interface PolizaService {
	
	public Poliza findByDsNumero(String dsNumero);
}
