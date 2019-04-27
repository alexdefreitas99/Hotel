package com.viaflow.hotel.api.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.viaflow.hotel.api.entity.servico.Servico;

@Component
public class ServicoValidation implements BaseValidation<Servico>{

	@Override
	public boolean validateObject(Servico object, BindingResult result) {
		if (object.getServicoNome() == null || object.getServicoNome().isEmpty()) {
			result.addError(new ObjectError("Role", "Field First Name should be informed"));
		}
		
		return !result.hasErrors();
	}

}
