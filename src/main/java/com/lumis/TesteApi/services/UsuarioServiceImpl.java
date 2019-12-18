package com.lumis.TesteApi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lumis.TesteApi.models.Usuario;
import com.lumis.TesteApi.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public UsuarioServiceImpl(UsuarioRepository usuarioRepositoy) {
		this.usuarioRepository = usuarioRepositoy;
	}
	
	
	@Override
	public Usuario findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario create() {
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
	
}
