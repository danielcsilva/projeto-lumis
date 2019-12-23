package com.lumis.TesteApi.services;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import com.lumis.TesteApi.models.Usuario;
import com.lumis.TesteApi.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	
	public UsuarioServiceImpl(
			UsuarioRepository usuarioRepositoy, 
			PerfilService perfilService) 
	{
		this.usuarioRepository = usuarioRepositoy;
	}
	
	

	@Override
	public Usuario find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Usuario update() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> findAll() {
		
		return (List<Usuario>) this.usuarioRepository.findAll();
	}

	@Override
	public ResponseEntity<?> create(Usuario usuario, Errors errors){
		if(!errors.hasErrors()) {
			
			Usuario usuarioCriado = this.usuarioRepository.save(usuario);
			
			return new ResponseEntity<Usuario>(usuarioCriado,HttpStatus.CREATED);
		}
		
		return ResponseEntity
				.badRequest()
				.body(errors
						.getAllErrors()
						.stream()
						.map(msg -> msg.getDefaultMessage())
						.collect(Collectors.joining(",")));
	}



	@Override
	public List<Usuario> findByAllParam(String nome, String cpf, String sexo, Date dtnascimento, Boolean status) {
		// TODO Auto-generated method stub
		return null;
	}




}
