package com.lumis.TesteApi.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@Column
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idcargo")
	private Set<Usuario> usuario;


	public Cargo(Long idCargo, String tipoCargo) {
		this.idCargo = idCargo;
		this.tipoCargo = tipoCargo;
	}

	public Cargo() {
	}
	

	public Set<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(Set<Usuario> usuario) {
		this.usuario = usuario;
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
