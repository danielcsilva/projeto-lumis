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
@Table(name = "perfil")
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idperfil")
	private Long idPerfil;
	
	@Column
	private String tipoPerfil;
	
	@Column
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idperfil")
	private Set<Usuario> usuario;
	
	public Perfil() {
		
	}
	
	public Perfil(Long idPerfil, String tipoPerfil) {
		this.idPerfil = idPerfil;
		this.tipoPerfil = tipoPerfil;
	}


	public Long getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Long idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getTipoPerfil() {
		return tipoPerfil;
	}

	public void setTipoPerfil(String tipoPerfil) {
		this.tipoPerfil = tipoPerfil;
	}

	public Set<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(Set<Usuario> usuario) {
		this.usuario = usuario;
	}
		
}