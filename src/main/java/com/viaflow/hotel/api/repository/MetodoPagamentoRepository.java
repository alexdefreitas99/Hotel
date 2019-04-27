package com.viaflow.hotel.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.viaflow.hotel.api.entity.hospede.MetodoPagamento;

@Repository
public interface MetodoPagamentoRepository extends MongoRepository<MetodoPagamento, String>{
	MetodoPagamento findByTipoPagamentoIgnoreCaseContaining(String tipoPagamento);

}
