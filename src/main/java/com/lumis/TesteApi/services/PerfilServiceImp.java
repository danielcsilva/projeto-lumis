package com.lumis.TesteApi.services;

import java.util.List;
import java.util.Optional;

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
	public List<Perfil> findAll() {
		return this.perfilRepository.findAll();
	}

	@Override
	public Optional<Perfil> find(Long id) {
		return this.perfilRepository.findById(id);
	}

	@Override
	public Perfil create(Perfil perfil) {
		return this.perfilRepository.save(perfil);
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
