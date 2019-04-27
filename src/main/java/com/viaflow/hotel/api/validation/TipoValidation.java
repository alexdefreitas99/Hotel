package com.viaflow.hotel.api.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.viaflow.hotel.api.entity.quarto.Tipo;

@Component
public class TipoValidation implements BaseValidation<Tipo>{

	@Override
	public boolean validateObject(Tipo object, BindingResult result) {
		if (object.getNomeTipo() == null || object.getNomeTipo().isEmpty()) {
			result.addError(new ObjectError("Role", "Field First Name should be informed"));
		}
		
		return !result.hasErrors();
	}

}
