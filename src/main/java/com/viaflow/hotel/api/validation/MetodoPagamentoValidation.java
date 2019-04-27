package com.viaflow.hotel.api.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.viaflow.hotel.api.entity.hospede.MetodoPagamento;

@Component
public class MetodoPagamentoValidation implements BaseValidation<MetodoPagamento>{

	@Override
	public boolean validateObject(MetodoPagamento object, BindingResult result) {
		if (object.getTipoPagamento() == null || object.getTipoPagamento().isEmpty()) {
			result.addError(new ObjectError("Metodo pagamento", "tipo de pagamento não informado"));
		}
		
		return !result.hasErrors();
	}

}
