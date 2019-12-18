package com.lumis.TesteApi.services;

import com.lumis.TesteApi.models.Perfil;

public interface PerfilService {
	
	
	public Perfil findAll();
	
	public Perfil find(Long id);
	
	public Perfil create();
	
	public Perfil delete(Long id);
	
	public Perfil update();
	

}
