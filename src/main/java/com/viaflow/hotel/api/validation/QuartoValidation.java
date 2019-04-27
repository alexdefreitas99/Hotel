package com.viaflow.hotel.api.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.viaflow.hotel.api.entity.quarto.Quarto;

@Component
public class QuartoValidation implements BaseValidation<Quarto>{

	@Override
	public boolean validateObject(Quarto object, BindingResult result) {
		if (object.getNumeroQuarto() == null || object.getNumeroQuarto().isEmpty()) {
			result.addError(new ObjectError("Role", "Field First Name should be informed"));
		}
		
		return !result.hasErrors();
	}

}
