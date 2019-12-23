package com.lumis.TesteApi.services;

import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;

import com.lumis.TesteApi.models.*;

public interface UsuarioService {

	public List<Usuario> findAll();
	
	public Usuario find(Long id);
	
	public ResponseEntity<?> create(Usuario usuario, Errors errors);
	
	public ResponseEntity<?> update(Long id, Usuario usuario, Errors errors);
	
	public void delete(Long id);

	List<Usuario> findByAllParam(String nome, String cpf, String sexo, Date dtnascimento, Boolean status);
	
}
