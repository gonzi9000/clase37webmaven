package com.proyecto.modelo;

import java.util.Arrays;

public class UsuarioVO {

	private String nombre;
	private String apellido;
	private String email;
	private String [] lenguaje;
	
	public UsuarioVO(String nombre, String apellido, String email, String[] lenguaje) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.lenguaje = lenguaje;
	}
	public UsuarioVO() {
	
	}
	public String getNombre() {
		return nombre;
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
	public String getLenguaje() {
		String datos="";
		for(String x : lenguaje) {
			datos += x + ", ";
		}
		return datos;
	}
	public void setLenguaje(String[] lenguaje) {
		this.lenguaje = lenguaje;
	}
	@Override
	public String toString() {
		return "UsuarioVO [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", lenguaje="
				+ Arrays.toString(lenguaje) + "]";
	}
	
	
	
	
	
	
	
	
}
