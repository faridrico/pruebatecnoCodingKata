package com.tecnofactor.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnofactor.model.Poliza;
import com.tecnofactor.repository.PolizaRepository;
import com.tecnofactor.service.PolizaService;

@Service
public class PolizaServiceImpl implements PolizaService {

	@Autowired
	PolizaRepository polizaRepository;
	
	@Override
	public Poliza findByDsNumero(String dsNumero) {
		return polizaRepository.findByDsNumero(dsNumero);
	}

}
