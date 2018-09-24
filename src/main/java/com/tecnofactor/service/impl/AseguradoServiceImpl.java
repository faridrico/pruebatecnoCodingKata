package com.tecnofactor.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnofactor.model.Asegurado;
import com.tecnofactor.repository.AseguradoRepository;
import com.tecnofactor.service.AseguradoService;

@Service
public class AseguradoServiceImpl implements AseguradoService {

	@Autowired
	private AseguradoRepository aseguradoRepository;
	
	@Override
	public Asegurado findByNmDocumento(String nmDocumento) {
		return aseguradoRepository.findByNmDocumento(nmDocumento);
	}

}
