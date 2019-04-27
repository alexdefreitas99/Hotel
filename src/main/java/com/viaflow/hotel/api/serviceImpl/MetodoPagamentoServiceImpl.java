package com.viaflow.hotel.api.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viaflow.hotel.api.entity.hospede.MetodoPagamento;
import com.viaflow.hotel.api.repository.MetodoPagamentoRepository;
import com.viaflow.hotel.api.service.MetodoPagamentoService;

@Service
public class MetodoPagamentoServiceImpl extends BaseServiceImpl<MetodoPagamento, MetodoPagamentoRepository> implements MetodoPagamentoService {
	
	@Autowired
	private MetodoPagamentoRepository metodoPagamentoRepository; 
	@Override
	protected MetodoPagamentoRepository getRepo() {
		return this.metodoPagamentoRepository;
	}

	@Override
	public MetodoPagamento findByTipoPagamento(String name) {
		return this.getRepo().findByTipoPagamentoIgnoreCaseContaining(name);
	}

}
