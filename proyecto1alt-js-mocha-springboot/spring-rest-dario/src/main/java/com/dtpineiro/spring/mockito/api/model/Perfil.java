package com.dtpineiro.spring.mockito.api.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Perfil {
	@Id
	@GeneratedValue
	private int id;
	@JsonProperty("Cuenta_ppal")
	private Integer cuentaPpal;
	@JsonProperty("Tipo_cliente")
	private String tipoCliente;
	@JsonProperty("Tarjeta_debito")
	private Integer tarjetaDebito;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getCuentaPpal() {
		return cuentaPpal;
	}
	public void setCuentaPpal(Integer cuentaPpal) {
		this.cuentaPpal = cuentaPpal;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	public Integer getTarjetaDebito() {
		return tarjetaDebito;
	}
	public void setTarjetaDebito(Integer tarjetaDebito) {
		this.tarjetaDebito = tarjetaDebito;
	}
	
	
}
