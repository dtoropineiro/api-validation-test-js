package com.dtpineiro.spring.mockito.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class DatoCliente {
	@Id
	@GeneratedValue
	private int id;
	@JsonProperty("Nombre")
	private String nombre;
	@JsonProperty("Apellido")
	private String apellido;
	@JsonProperty("Direccion")
	private String direccion;
	@JsonProperty("Email")
	private String email;
	@JsonProperty("Telefono")
	private Long telefono;
	@JsonProperty("RUT")
	private Integer rut;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public Integer getRut() {
		return rut;
	}

	public void setRut(Integer rut) {
		this.rut = rut;
	}

	@Override
	public String toString() {
		return "DatoCliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", email=" + email + ", telefono=" + telefono + ", rut=" + rut + "]";
	}
	
	
}
