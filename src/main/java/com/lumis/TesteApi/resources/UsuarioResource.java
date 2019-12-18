package com.lumis.TesteApi.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lumis.TesteApi.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {

	private UsuarioService usuarioService;
	
	public  UsuarioResource(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	
}