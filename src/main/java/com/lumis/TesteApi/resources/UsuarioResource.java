package com.lumis.TesteApi.resources;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lumis.TesteApi.models.Cargo;
import com.lumis.TesteApi.models.Perfil;
import com.lumis.TesteApi.models.Usuario;
import com.lumis.TesteApi.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {

	@Autowired
	private UsuarioService usuarioService;
	
	public  UsuarioResource(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	@GetMapping(produces = "application/json")
	@ResponseBody
	public ResponseEntity<?> findAll(){
		
		List<Usuario> list = this.usuarioService.findAll();
			
		return new ResponseEntity<List>(list,HttpStatus.OK);
		
	}
	
	
	@PostMapping(path =  "/save/perfil/{idperfil}/cargo/{idcargo}",produces = "application/json")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<?>  create(@PathVariable("idperfil") Long idPerfil ,@PathVariable("idcargo") Long idcargo ,@Valid @RequestBody Usuario usuario, Errors errors){
		
		Perfil perfil = new Perfil();
		
		perfil.setIdPerfil(idPerfil);
		
		usuario.setIdperfil(perfil);
		
		Cargo cargo = new Cargo();
		
		cargo.setIdCargo(idcargo);
		
		usuario.setIdcargo(cargo);
		
		return this.usuarioService.create(usuario, errors);
		
	}
	
	
	
	
}