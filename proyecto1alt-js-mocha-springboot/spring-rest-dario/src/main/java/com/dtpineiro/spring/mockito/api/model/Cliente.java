package com.dtpineiro.spring.mockito.api.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Cliente {
	@Id
	@GeneratedValue
	private int id;
	@OneToOne(cascade = {CascadeType.ALL})
	@JsonProperty("Dato_cliente")
	private DatoCliente dato_cliente;
	@OneToOne(cascade = {CascadeType.ALL})
	@JsonProperty("Dato_perfil")
	private Perfil dato_perfil;
	@OneToOne(cascade = {CascadeType.ALL})
	@JsonProperty("Dato_Sucursal")
	private Sucursal dato_sucursal;
	@OneToOne(cascade = {CascadeType.ALL})
	@JsonProperty("Dato_productos")
	private Producto dato_productos;
	@OneToOne(cascade = {CascadeType.ALL})
	@JsonProperty("Datos_seguros")
	private Seguro dato_seguros;
	@OneToOne(cascade = {CascadeType.ALL})
	@JsonProperty("Datos_fondos")
	private Fondo dato_fondos;
	@OneToOne(cascade = {CascadeType.ALL})
	@JsonProperty("Datos_penalizaciones")
	private Penalizacion dato_penalizaciones;
	
	public Cliente() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DatoCliente getDato_cliente() {
		return dato_cliente;
	}

	public void setDato_cliente(DatoCliente dato_cliente) {
		this.dato_cliente = dato_cliente;
	}

	public Perfil getDato_perfil() {
		return dato_perfil;
	}

	public void setDato_perfil(Perfil dato_perfil) {
		this.dato_perfil = dato_perfil;
	}

	public Sucursal getDato_sucursal() {
		return dato_sucursal;
	}

	public void setDato_sucursal(Sucursal dato_sucursal) {
		this.dato_sucursal = dato_sucursal;
	}

	public Producto getDato_productos() {
		return dato_productos;
	}

	public void setDato_productos(Producto dato_productos) {
		this.dato_productos = dato_productos;
	}

	public Seguro getDato_seguros() {
		return dato_seguros;
	}

	public void setDato_seguros(Seguro dato_seguros) {
		this.dato_seguros = dato_seguros;
	}

	public Fondo getDato_fondos() {
		return dato_fondos;
	}

	public void setDato_fondos(Fondo dato_fondos) {
		this.dato_fondos = dato_fondos;
	}

	public Penalizacion getDato_penalizaciones() {
		return dato_penalizaciones;
	}

	public void setDato_penalizaciones(Penalizacion dato_penalizaciones) {
		this.dato_penalizaciones = dato_penalizaciones;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", dato_cliente=" + dato_cliente + ", dato_perfil=" + dato_perfil
				+ ", dato_sucursal=" + dato_sucursal + ", dato_productos=" + dato_productos + ", dato_seguros="
				+ dato_seguros + ", dato_fondos=" + dato_fondos + ", dato_penalizaciones=" + dato_penalizaciones + "]";
	}
	
	
	
}
