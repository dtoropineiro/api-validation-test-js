package com.dtpineiro.spring.mockito.api.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Fondo {
	@Id
	@GeneratedValue
	private int id;
	@JsonProperty("Fondo_mutual")
	private String fondoMutual;
	@JsonProperty("Ahorro_previsional")
	private Integer ahorroPrevisional;
	@JsonProperty("ctaRentaDiaria")
	private String ctaRentaDiaria;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFondoMutual() {
		return fondoMutual;
	}
	public void setFondoMutual(String fondoMutual) {
		this.fondoMutual = fondoMutual;
	}
	public Integer getAhorroPrevisional() {
		return ahorroPrevisional;
	}
	public void setAhorroPrevisional(Integer ahorroPrevisional) {
		this.ahorroPrevisional = ahorroPrevisional;
	}
	public String getCtaRentaDiaria() {
		return ctaRentaDiaria;
	}
	public void setCtaRentaDiaria(String ctaRentaDiaria) {
		this.ctaRentaDiaria = ctaRentaDiaria;
	}
	
	
}
