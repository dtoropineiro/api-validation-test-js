package com.dtpineiro.spring.mockito.api.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Producto {
	@Id
	@GeneratedValue
	private int id;
	@JsonProperty("Tiene_prod")
	private Boolean tieneProductos;
	@JsonProperty("Tipo_producto")
	private String[] tipoProducto = {"Consumo","Hipotecario"
			,"Linea_emergencia","Linea_sobregiro"};
	@JsonProperty("Puntos")
	private Integer puntos;
	@JsonProperty("Tarjeta_credito")
	private Long tarjetaCredito;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Boolean getTieneProductos() {
		return tieneProductos;
	}
	public void setTieneProductos(Boolean tieneProductos) {
		this.tieneProductos = tieneProductos;
	}
	public String[] getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String[] tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public Integer getPuntos() {
		return puntos;
	}
	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
	public Long getTarjetaCredito() {
		return tarjetaCredito;
	}
	public void setTarjetaCredito(Long tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	
	
}
