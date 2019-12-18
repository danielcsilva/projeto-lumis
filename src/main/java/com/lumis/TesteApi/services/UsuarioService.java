package com.lumis.TesteApi.services;

import com.lumis.TesteApi.models.*;

public interface UsuarioService {

	public Usuario findAll();
	
	public Usuario find(Long id);
	
	public Usuario create();
	
	public Usuario update();
	
	public void delete();
	
}
