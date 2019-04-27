package com.viaflow.hotel.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viaflow.hotel.api.entity.quarto.Tipo;
import com.viaflow.hotel.api.service.TipoService;
import com.viaflow.hotel.api.validation.BaseValidation;
import com.viaflow.hotel.api.validation.TipoValidation;

@RestController
@RequestMapping(value="/api/tipo")
@CrossOrigin("*")
public class TipoWebController extends BaseController<Tipo, TipoService, BaseValidation<Tipo>>{
	
	@Autowired
	private TipoService tipoService;
	
	@Autowired
	private TipoValidation tipoValidation;
	
	@Override
	protected TipoService getService() {
		return this.tipoService;
	}

	@Override
	protected BaseValidation<Tipo> getValidation() {
		return this.tipoValidation;
	}

}
