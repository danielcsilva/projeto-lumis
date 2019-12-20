package com.lumis.TesteApi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lumis.TesteApi.models.Cargo;
import com.lumis.TesteApi.repository.CargoRepository;

@RestController
@RequestMapping("/cargo")
public class CargoResource {

	@Autowired
	private CargoRepository cargoRepository;
	
	public CargoResource(CargoRepository cargoRepository) {
		this.cargoRepository = cargoRepository;
	}
	
	@GetMapping
	@ResponseBody
	public List<Cargo> findAll(){
		return this.cargoRepository.findAll();
	}
	
	
	
	@PostMapping
	@ResponseBody
	public Cargo create(@RequestBody Cargo cargo) {
		this.cargoRepository.save(cargo);
		return cargo;
	}
}
