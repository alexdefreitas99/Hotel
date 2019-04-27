package com.viaflow.hotel.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viaflow.hotel.api.entity.servico.Servico;
import com.viaflow.hotel.api.service.ServicoService;
import com.viaflow.hotel.api.validation.BaseValidation;
import com.viaflow.hotel.api.validation.ServicoValidation;

@RestController
@RequestMapping(value="/api/servico")
@CrossOrigin("*")
public class ServicoWebController extends BaseController<Servico, ServicoService, BaseValidation<Servico>>{

	@Autowired
	private ServicoService servicoService;
	
	@Autowired
	private ServicoValidation servicoValidation; 
	
	@Override
	protected ServicoService getService() {
		return this.servicoService;
	}

	@Override
	protected BaseValidation<Servico> getValidation() {
		return this.servicoValidation;
	}

}
