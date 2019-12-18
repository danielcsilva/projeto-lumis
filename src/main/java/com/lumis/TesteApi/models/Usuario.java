package com.lumis.TesteApi.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private String cpf;
	
	@Column
	private String sexo;
	
	@Column
	private Date dtNascimento;
	
	@ManyToOne
	@JoinColumn(name = "idcargo")
	private Cargo cargo;

	@ManyToOne
	@JoinColumn(name = "idperfil")
	private Perfil perfil;
	
	@Column
	private boolean status;

	public Usuario(Long id, String nome, String cpf, String sexo, Date dtNascimento, Cargo cargo, Perfil perfil, boolean status) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.dtNascimento = dtNascimento;
		this.cargo = cargo;
		this.perfil = perfil;
		this.status = status;
	}

	public Usuario() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
