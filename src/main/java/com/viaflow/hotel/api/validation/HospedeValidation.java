package com.viaflow.hotel.api.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.viaflow.hotel.api.entity.hospede.Hospede;

@Component
public class HospedeValidation implements BaseValidation<Hospede>{

	@Override
	public boolean validateObject(Hospede object, BindingResult result) {
		if (object.getHospedeNome() == null || object.getHospedeNome().isEmpty()) {
			result.addError(new ObjectError("Hospede", "Name should be informed"));
		}		
		
		return !result.hasErrors();
	}

}
