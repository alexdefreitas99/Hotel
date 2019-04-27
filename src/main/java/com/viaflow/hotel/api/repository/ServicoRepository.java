package com.viaflow.hotel.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.viaflow.hotel.api.entity.servico.Servico;

@Repository
public interface ServicoRepository extends MongoRepository<Servico, String>{

}
