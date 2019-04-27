package com.viaflow.hotel.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viaflow.hotel.api.entity.hospede.Hospede;
import com.viaflow.hotel.api.service.HospedeService;
import com.viaflow.hotel.api.validation.BaseValidation;
import com.viaflow.hotel.api.validation.HospedeValidation;

@RestController
@RequestMapping(value="/api/hospede")
@CrossOrigin("*")
public class HospedeWebController extends BaseController<Hospede, HospedeService, BaseValidation<Hospede>>{

	@Autowired
	private HospedeService hospedeService;
	
	@Autowired
	private HospedeValidation hospedeValidation;
	
	@Override
	protected HospedeService getService() {
		return this.hospedeService;
	}

	@Override
	protected BaseValidation<Hospede> getValidation() {
		return this.hospedeValidation;
	}

}
