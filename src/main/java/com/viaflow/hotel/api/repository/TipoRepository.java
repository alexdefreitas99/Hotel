package com.viaflow.hotel.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.viaflow.hotel.api.entity.quarto.Tipo;

@Repository
public interface TipoRepository extends MongoRepository<Tipo, String>{

}
