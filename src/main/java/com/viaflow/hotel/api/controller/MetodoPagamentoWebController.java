package com.viaflow.hotel.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viaflow.hotel.api.entity.hospede.MetodoPagamento;
import com.viaflow.hotel.api.service.MetodoPagamentoService;
import com.viaflow.hotel.api.validation.BaseValidation;
import com.viaflow.hotel.api.validation.MetodoPagamentoValidation;
import com.viaflow.manager.api.response.Response;

@RestController
@RequestMapping("/api/metodopagamento")
@CrossOrigin("*")
public class MetodoPagamentoWebController extends BaseController<MetodoPagamento, MetodoPagamentoService, BaseValidation<MetodoPagamento>>{
	
	@Autowired
	private MetodoPagamentoService metodoPagamentoService;
	
	@Autowired
	private MetodoPagamentoValidation metodoPagamentoValidation;
	
	@Override
	protected MetodoPagamentoService getService() {
		return this.metodoPagamentoService;
	}

	@Override
	protected BaseValidation<MetodoPagamento> getValidation() {
		return this.metodoPagamentoValidation;
	}
	
	@GetMapping("/find/name/{name}")
	public ResponseEntity<Response<MetodoPagamento>> getTipoPagamento(@PathVariable("name") String tipoPagamento){
		Response<MetodoPagamento> response = new Response<>();
		MetodoPagamento metodoPagamento = getService().findByTipoPagamento(tipoPagamento);
		if (metodoPagamento == null) {
			response.getErrors().add("Register not found " + tipoPagamento);
			return ResponseEntity.badRequest().body(response);
		}

		response.setData(metodoPagamento);
		return ResponseEntity.ok(response);
	}

}
