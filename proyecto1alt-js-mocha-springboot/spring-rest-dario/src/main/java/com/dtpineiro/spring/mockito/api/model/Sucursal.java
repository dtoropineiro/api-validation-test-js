package com.dtpineiro.spring.mockito.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Sucursal {
	@Id
	@GeneratedValue
	private int id;
	@JsonProperty("Sucursal_nro")
	private Integer sucursalNumero;
	@JsonProperty("Ejecutivo")
	private String ejecutivo;
	@JsonProperty("Telefono_ejec")
	private Integer telefonoEjecutivo;
	@JsonProperty("Direccion_suc")
	private String direccionSucursal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getSucursalNumero() {
		return sucursalNumero;
	}
	public void setSucursalNumero(Integer sucursalNumero) {
		this.sucursalNumero = sucursalNumero;
	}
	public String getEjecutivo() {
		return ejecutivo;
	}
	public void setEjecutivo(String ejecutivo) {
		this.ejecutivo = ejecutivo;
	}
	public Integer getTelefonoEjecutivo() {
		return telefonoEjecutivo;
	}
	public void setTelefonoEjecutivo(Integer telefonoEjecutivo) {
		this.telefonoEjecutivo = telefonoEjecutivo;
	}
	public String getDireccionSucursal() {
		return direccionSucursal;
	}
	public void setDireccionSucursal(String direccionSucursal) {
		this.direccionSucursal = direccionSucursal;
	}
	
	
}
