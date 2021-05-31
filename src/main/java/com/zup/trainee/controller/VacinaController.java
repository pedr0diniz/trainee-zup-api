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

import com.zup.trainee.model.Vacina;
import com.zup.trainee.repository.VacinaRepository;


@RestController
@RequestMapping(value = "/vacinas", headers = "Accept=application/json")
public class VacinaController {
	
	@Autowired //instancia automaticamente os métodos do JPA para nós
	private VacinaRepository vacinaRepository;
	
	@GetMapping
	public List<Vacina> vacinasList() {
		return vacinaRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Vacina adicionarVacina(@RequestBody Vacina vacina) {
		return vacinaRepository.save(vacina);
	}
}
