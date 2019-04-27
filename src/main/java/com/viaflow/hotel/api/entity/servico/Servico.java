package com.viaflow.hotel.api.entity.servico;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Servico {
	
	@Id
	private String servicoId;
	
	@NotEmpty
	private String servicoNome;
	
	@NotEmpty
	private Float preco;

	public String getServicoId() {
		return servicoId;
	}

	public void setServicoId(String servicoId) {
		this.servicoId = servicoId;
	}

	public String getServicoNome() {
		return servicoNome;
	}

	public void setServicoNome(String servicoNome) {
		this.servicoNome = servicoNome;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Servico [servicoId=" + servicoId + ", servicoNome=" + servicoNome + ", preco=" + preco + "]";
	}


	
}
