package com.lumis.TesteApi.services;

import java.util.List;

import com.lumis.TesteApi.models.Cargo;

public interface CargoService {

	public List<Cargo> findAll();
	
	public Cargo find(Long id);
	
	public Cargo create(Cargo cargo);
	
	public Cargo update();

	public void delete();
	
}
