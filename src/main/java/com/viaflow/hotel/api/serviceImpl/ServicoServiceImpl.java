package com.viaflow.hotel.api.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viaflow.hotel.api.entity.servico.Servico;
import com.viaflow.hotel.api.repository.ServicoRepository;
import com.viaflow.hotel.api.service.ServicoService;

@Service
public class ServicoServiceImpl extends BaseServiceImpl<Servico, ServicoRepository> implements ServicoService{
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	@Override
	protected ServicoRepository getRepo() {
		return this.servicoRepository;
	}

}
