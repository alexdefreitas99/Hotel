package com.viaflow.hotel.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viaflow.hotel.api.entity.quarto.Quarto;
import com.viaflow.hotel.api.service.QuartoService;
import com.viaflow.hotel.api.validation.BaseValidation;
import com.viaflow.hotel.api.validation.QuartoValidation;

@RestController
@RequestMapping(value="/api/quarto")
@CrossOrigin("*")
public class QuartoWebController extends BaseController<Quarto, QuartoService, BaseValidation<Quarto>>{

	@Autowired
	private QuartoService quartoService;
	
	@Autowired
	private QuartoValidation quartoValidation;
	
	@Override
	protected QuartoService getService() {
		return this.quartoService;
	}

	@Override
	protected BaseValidation<Quarto> getValidation() {
		return this.quartoValidation;
	}

}
