package com.dtpineiro.spring.mockito.api.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Seguro {
	@Id
	@GeneratedValue
	private int id;
	@JsonProperty("Tiene_prod")
	private Boolean tieneProd;
	@JsonProperty("SOAP")
	private String soap;
	@JsonProperty("Seguro_vehiculo")
	private String seguroVehiculo;
	@JsonProperty("Seguro_fraude")
	private String seguroFraude;
	@JsonProperty("Seguro_hogar")
	private String seguroHogar;
	@JsonProperty("Seguro_vida")
	private String seguroVida;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Boolean getTieneProd() {
		return tieneProd;
	}
	public void setTieneProd(Boolean tieneProd) {
		this.tieneProd = tieneProd;
	}
	public String getSoap() {
		return soap;
	}
	public void setSoap(String soap) {
		this.soap = soap;
	}
	public String getSeguroVehiculo() {
		return seguroVehiculo;
	}
	public void setSeguroVehiculo(String seguroVehiculo) {
		this.seguroVehiculo = seguroVehiculo;
	}
	public String getSeguroFraude() {
		return seguroFraude;
	}
	public void setSeguroFraude(String seguroFraude) {
		this.seguroFraude = seguroFraude;
	}
	public String getSeguroHogar() {
		return seguroHogar;
	}
	public void setSeguroHogar(String seguroHogar) {
		this.seguroHogar = seguroHogar;
	}
	public String getSeguroVida() {
		return seguroVida;
	}
	public void setSeguroVida(String seguroVida) {
		this.seguroVida = seguroVida;
	}
	
	
	
}
