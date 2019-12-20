package com.lumis.TesteApi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lumis.TesteApi.models.Perfil;
import com.lumis.TesteApi.services.PerfilService;

@RestController
@RequestMapping("/perfil")
public class PerfilResource {

	@Autowired
	private PerfilService perfilService;
	
	
	public PerfilResource(PerfilService perfilService) {
		
		this.perfilService = perfilService;
		
	}
	
	@SuppressWarnings("rawtypes")
	@GetMapping
	@ResponseBody
	public ResponseEntity<?> findAll(Error error){
		
		List<Perfil> list = (List<Perfil>) this.perfilService.findAll();
		
		return new ResponseEntity<List>(list, HttpStatus.OK);
	}
	
	
	@PostMapping
	@ResponseBody
	public Perfil create(@RequestBody Perfil perfil) {
	
		return this.perfilService.create(perfil);
	}
}
