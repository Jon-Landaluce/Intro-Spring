package com.example.demo.es.entity;

import org.springframework.stereotype.Component;

@Component
public class Persona {
	
	private String nombre;
	private String apellido;
	private String email;
	private int telefono;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellido, String email, int telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

}
