package com.zup.trainee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zup.trainee.model.Usuario;
import com.zup.trainee.repository.UsuarioRepository;

@RestController
@RequestMapping(value = "/usuarios", headers = "Accept=application/json")
public class UsuarioController {

	@Autowired //instancia automaticamente os métodos do JPA para nós
	private UsuarioRepository usuarioRepository;
	
	@GetMapping
	public List<Usuario> usuariosList() {
		return usuarioRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario adicionarUsuario(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
}
