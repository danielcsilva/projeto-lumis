package com.lumis.TesteApi.services;

import org.springframework.stereotype.Service;

import com.lumis.TesteApi.models.Perfil;
import com.lumis.TesteApi.repository.PerfilRespository;

@Service
public class PerfilServiceImp implements PerfilService {
	
	private PerfilRespository perfilRepository;
	
	public PerfilServiceImp(PerfilRespository perfilRespository) {
		this.perfilRepository = perfilRespository;
	}

	@Override
	public Perfil findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perfil find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perfil create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perfil delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perfil update() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
