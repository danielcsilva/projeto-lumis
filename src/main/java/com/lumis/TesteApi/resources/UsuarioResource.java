package com.lumis.TesteApi.resources;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lumis.TesteApi.models.Usuario;
import com.lumis.TesteApi.services.CargoService;
import com.lumis.TesteApi.services.UsuarioService;

@RestController
@RequestMapping("/cargo/{idcargo}/usuario")
public class UsuarioResource {

	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private CargoService cargoService;
	
	public  UsuarioResource(UsuarioService usuarioService, CargoService cargoService) {
		this.usuarioService = usuarioService;
		this.cargoService = cargoService;
	}
	
	
	@GetMapping(produces = "application/json")
	@ResponseBody
	public ResponseEntity<?> findAll(Error error){
		
		List<Usuario> list = this.usuarioService.findAll();
			
		return new ResponseEntity<List>(list,HttpStatus.OK);
		
	}
	
	
	@PostMapping(produces = "application/json")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<?> create(@PathVariable("cargoId") @Valid @RequestBody Usuario usuario, Errors errors){
		if(!errors.hasErrors()) {
			
			Usuario usuarioCriado = this.usuarioService.create(usuario);
			
			return new ResponseEntity<Usuario>(usuarioCriado,HttpStatus.CREATED);
		}
		
		return ResponseEntity
				.badRequest()
				.body(errors
						.getAllErrors()
						.stream()
						.map(msg -> msg.getDefaultMessage())
						.collect(Collectors.joining(",")));
	}
	
	
	
	
}