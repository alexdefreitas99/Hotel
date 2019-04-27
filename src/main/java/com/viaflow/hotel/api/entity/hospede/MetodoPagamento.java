package com.viaflow.hotel.api.entity.hospede;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MetodoPagamento {
	
	@Id
	private String metodoPagamentoId;

	@NotEmpty
	private String tipoPagamento;

	public String getMetodoPagamentoId() {
		return metodoPagamentoId;
	}

	public void setMetodoPagamentoId(String metodoPagamentoId) {
		this.metodoPagamentoId = metodoPagamentoId;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return "MetodoPagamento [metodoPagamentoId=" + metodoPagamentoId + ", tipoPagamento=" + tipoPagamento + "]";
	}

	
	
	

}
