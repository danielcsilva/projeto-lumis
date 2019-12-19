package com.lumis.TesteApi.services;

import java.util.List;


import com.lumis.TesteApi.models.*;

public interface UsuarioService {

	public List<Usuario> findAll();
	
	public Usuario find(Long id);
	
	public Usuario create(Usuario usuario);
	
	public Usuario update();
	
	public void delete();
	
}
