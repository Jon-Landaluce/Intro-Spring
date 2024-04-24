package com.example.demo.es.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.es.entity.Persona;
import com.example.demo.es.services.PersonaService;

@RestController // Defina la clase como controlador
public class HelloController {
	
//	//Persona persona = new Persona("Jose", "Perez", "jperez@gmail.com", 654098134);
//
//	@Autowired
//	Persona persona;
	
	@Autowired
	PersonaService personaService;
	
	@GetMapping("/saludar")
	public List<Persona> saludo() {
		return personaService.listaPersona();
//		persona.setNombre("Rolando");
//		persona.setEmail("rolando@email.com");
//		persona.setApellido("Lopez");
//		persona.setTelefono(654098134);
//		return persona;
	}

}
