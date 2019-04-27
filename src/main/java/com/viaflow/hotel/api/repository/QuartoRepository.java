package com.viaflow.hotel.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.viaflow.hotel.api.entity.quarto.Quarto;

@Repository
public interface QuartoRepository extends MongoRepository<Quarto, String>{

}
