package com.viaflow.hotel.api.entity.quarto;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Quarto {
	
	@Id
	private String quartoId;
	
	@NotEmpty
	private String numeroQuarto;
	
	@DBRef
	private Tipo tipoQuarto;
	
	@NotEmpty
	private Float precoDiaria;

	public String getQuartoId() {
		return quartoId;
	}

	public void setQuartoId(String quartoId) {
		this.quartoId = quartoId;
	}

	public String getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(String numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Tipo getTipoQuarto() {
		return tipoQuarto;
	}

	public void setTipoQuarto(Tipo tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}
	
	public Float getPrecoDiaria() {
		return precoDiaria;
	}

	public void setPrecoDiaria(Float precoDiaria) {
		this.precoDiaria = precoDiaria;
	}

	@Override
	public String toString() {
		return "quarto [quartoId=" + quartoId + ", numeroQuarto=" + numeroQuarto + ", tipoQuarto=" + tipoQuarto
				+ ", precoDiaria=" + precoDiaria + "]";
	}
	
}
