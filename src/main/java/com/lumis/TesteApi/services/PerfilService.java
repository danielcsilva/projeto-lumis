package com.lumis.TesteApi.services;

import java.util.List;
import java.util.Optional;

import com.lumis.TesteApi.models.Perfil;

public interface PerfilService {
	
	
	public List<Perfil> findAll();
	
	public Optional<Perfil> find(Long id);
	
	public Perfil create(Perfil perfil);
	
	public Perfil delete(Long id);
	
	public Perfil update();
	

}
