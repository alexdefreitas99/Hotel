package com.viaflow.hotel.api.entity.hospede;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Hospede {
	
	@Id
	private String hospedeId;
	
	@NotEmpty
	private String hospedeNome;
	
	@NotEmpty
	private String hospedeIdade;
	
	@NotEmpty
	private String telefone;
	
	@NotEmpty
	private String email;
	
	@DBRef
	private MetodoPagamento metodoPagamento;

	public String getHospedeId() {
		return hospedeId;
	}

	public void setHospedeId(String hospedeId) {
		this.hospedeId = hospedeId;
	}

	public String getHospedeNome() {
		return hospedeNome;
	}

	public void setHospedeNome(String hospedeNome) {
		this.hospedeNome = hospedeNome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public MetodoPagamento getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public String getHospedeIdade() {
		return hospedeIdade;
	}

	public void setHospedeIdade(String hospedeIdade) {
		this.hospedeIdade = hospedeIdade;
	}

	@Override
	public String toString() {
		return "Hospede [hospedeId=" + hospedeId + ", hospedeNome=" + hospedeNome + ", hospedeIdade=" + hospedeIdade
				+ ", telefone=" + telefone + ", email=" + email + ", metodoPagamento=" + metodoPagamento + "]";
	}

	
}

