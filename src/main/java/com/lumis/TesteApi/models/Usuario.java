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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.beans.factory.annotation.Required;

import com.sun.istack.NotNull;


@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@NotBlank(message = "Não pode ser vázio")
	@NotEmpty(message = "Não pode ser vario")
	@Size(min=1, max=255)
	private String nome;
	
	@Column
	@CPF(message = "Favor informar um CPF válido")
	@NotBlank(message = "Não pode ser vázio")
	@NotEmpty(message = "Não pode ser vario")
	@Size(min=11, max=11, message = "O CPF deve ter 11 caracteres")
	private String cpf;
	
	@Column
	@NotBlank(message = "Não pode ser vázio")
	@NotEmpty(message = "Não pode ser vario")
	private String sexo;
	
	@Column
	private Date dtNascimento;
	
	@ManyToOne
	@JoinColumn(name = "idcargo")
	private Cargo idcargo;

	@ManyToOne
	@JoinColumn(name = "idperfil")
	private Perfil idperfil;
	
	@Column
	private boolean status;

	public Usuario(Long id, String nome, String cpf, String sexo, Date dtNascimento, Cargo cargo, Perfil perfil, boolean status) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.dtNascimento = dtNascimento;
		this.idcargo = cargo;
		this.idperfil = perfil;
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


	public Cargo getIdcargo() {
		return idcargo;
	}

	public void setIdcargo(Cargo idcargo) {
		this.idcargo = idcargo;
	}



	public Perfil getIdperfil() {
		return idperfil;
	}

	public void setIdperfil(Perfil idperfil) {
		this.idperfil = idperfil;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
