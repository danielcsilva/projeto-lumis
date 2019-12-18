package com.lumis.TesteApi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cargo")
public class Cargo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcargo")
	private Long idCargo;
	
	@Column
	private String tipoCargo;

	public Cargo(Long idCargo, String tipoCargo) {
		this.idCargo = idCargo;
		this.tipoCargo = tipoCargo;
	}

	public Cargo() {
	}

	public Long getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Long idCargo) {
		this.idCargo = idCargo;
	}

	public String getTipoCargo() {
		return tipoCargo;
	}

	public void setTipoCargo(String tipoCargo) {
		this.tipoCargo = tipoCargo;
	}
	
}
