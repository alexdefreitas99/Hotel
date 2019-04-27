package com.viaflow.hotel.api.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viaflow.hotel.api.entity.hospede.Hospede;
import com.viaflow.hotel.api.repository.HospedeRepository;
import com.viaflow.hotel.api.service.HospedeService;

@Service
public class HospedeServiceImpl extends BaseServiceImpl<Hospede, HospedeRepository> implements HospedeService{

	@Autowired
	private HospedeRepository hospedeRepository;
	
	@Override
	protected HospedeRepository getRepo() {
		return this.hospedeRepository;
	}

}

