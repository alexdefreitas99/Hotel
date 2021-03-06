package com.viaflow.hotel.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.viaflow.hotel.api.entity.hospede.Hospede;

@Repository
public interface HospedeRepository extends MongoRepository<Hospede, String>{

}
