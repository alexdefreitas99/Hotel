package com.viaflow.hotel.api.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viaflow.hotel.api.entity.quarto.Tipo;
import com.viaflow.hotel.api.repository.TipoRepository;
import com.viaflow.hotel.api.service.TipoService;

@Service
public class TipoServiceImpl extends BaseServiceImpl<Tipo, TipoRepository> implements TipoService {
	
	@Autowired
	private TipoRepository tipoRepository;
	
	@Override
	protected TipoRepository getRepo() {
		return this.tipoRepository;
	}

}
