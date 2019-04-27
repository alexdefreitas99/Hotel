package com.viaflow.hotel.api.service;

import org.springframework.stereotype.Service;

import com.viaflow.hotel.api.entity.hospede.MetodoPagamento;

@Service
public interface MetodoPagamentoService extends BaseService<MetodoPagamento>{
	MetodoPagamento findByTipoPagamento(String tipoPagamento);
}
