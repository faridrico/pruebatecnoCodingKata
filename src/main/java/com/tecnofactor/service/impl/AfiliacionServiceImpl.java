package com.tecnofactor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnofactor.model.Afiliacion;
import com.tecnofactor.repository.AfiliacionRepository;
import com.tecnofactor.service.AfiliacionService;

@Service
public class AfiliacionServiceImpl implements AfiliacionService {

	@Autowired
	AfiliacionRepository afiliacionRepository;
	
	
	@Override
	public void crearAfiliacion(Afiliacion afiliacion) {
		afiliacionRepository.save(afiliacion);
	}

}
