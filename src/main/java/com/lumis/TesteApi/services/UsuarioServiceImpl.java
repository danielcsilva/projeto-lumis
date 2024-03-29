package com.lumis.TesteApi.services;

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
	public ResponseEntity<?> update(Long id, Usuario usuario, Errors errors) {
		
		if(!errors.hasErrors()) {
					
					this.usuarioRepository.findById(id).map(record -> {
						
						record.setCpf(usuario.getCpf());
						record.setDtNascimento(usuario.getDtNascimento());
						record.setSexo(usuario.getSexo());
						record.setNome(usuario.getNome());
						record.setStatus(usuario.isStatus());
						record.setIdperfil(usuario.getIdperfil());
						record.setIdcargo(usuario.getIdcargo());
						Usuario usuarioUpdate = this.usuarioRepository.save(record);
						
						return new ResponseEntity<Usuario>(usuarioUpdate, HttpStatus.OK);
					
					});
					
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
	public void delete(Long id) {
		this.usuarioRepository.deleteById(id);
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
