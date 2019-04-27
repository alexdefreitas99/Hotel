package com.viaflow.hotel.api.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viaflow.hotel.api.entity.quarto.Quarto;
import com.viaflow.hotel.api.repository.QuartoRepository;
import com.viaflow.hotel.api.service.QuartoService;

@Service
public class QuartoServiceImpl extends BaseServiceImpl<Quarto, QuartoRepository> implements QuartoService {

	@Autowired
	private QuartoRepository quartoRepository; 
	
	@Override
	protected QuartoRepository getRepo() {
		return this.quartoRepository;
	}

}
