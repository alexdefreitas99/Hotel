package com.viaflow.hotel.api.entity.quarto;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Tipo {
	
	@Id
	private String tipoId;
	
	@NotEmpty
	private String nomeTipo;

	public String getTipoId() {
		return tipoId;
	}

	public void setTipoId(String tipoId) {
		this.tipoId = tipoId;
	}

	public String getNomeTipo() {
		return nomeTipo;
	}

	public void setNomeTipo(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}

	@Override
	public String toString() {
		return "Tipo [tipoId=" + tipoId + ", nomeTipo=" + nomeTipo + "]";
	}

}
