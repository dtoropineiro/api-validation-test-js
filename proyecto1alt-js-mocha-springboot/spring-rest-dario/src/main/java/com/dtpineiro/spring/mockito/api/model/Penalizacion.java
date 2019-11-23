package com.dtpineiro.spring.mockito.api.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Penalizacion {
	@Id
	@GeneratedValue
	private int id;
	@JsonProperty("InteresesMora_Sobregiro")
	private Integer interesesMoraSobregiro;
	@JsonProperty("InteresMora_TarjetaCredito")
	private Integer interesMoraTarjetaCredito;
	@JsonProperty("InteresMora_Consumo")
	private Integer interesMoraConsumo;
	@JsonProperty("InteresMora_Hipotecario")
	private Integer interesMoraHipotecario;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getInteresesMoraSobregiro() {
		return interesesMoraSobregiro;
	}
	public void setInteresesMoraSobregiro(Integer interesesMoraSobregiro) {
		this.interesesMoraSobregiro = interesesMoraSobregiro;
	}
	public Integer getInteresMoraTarjetaCredito() {
		return interesMoraTarjetaCredito;
	}
	public void setInteresMoraTarjetaCredito(Integer interesMoraTarjetaCredito) {
		this.interesMoraTarjetaCredito = interesMoraTarjetaCredito;
	}
	public Integer getInteresMoraConsumo() {
		return interesMoraConsumo;
	}
	public void setInteresMoraConsumo(Integer interesMoraConsumo) {
		this.interesMoraConsumo = interesMoraConsumo;
	}
	public Integer getInteresMoraHipotecario() {
		return interesMoraHipotecario;
	}
	public void setInteresMoraHipotecario(Integer interesMoraHipotecario) {
		this.interesMoraHipotecario = interesMoraHipotecario;
	}
	
	
}
