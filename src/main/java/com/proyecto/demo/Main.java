package com.proyecto.demo;

import com.proyecto.database.Conexion;
import com.proyecto.database.UsuarioDAO;
import com.proyecto.modelo.UsuarioVO;

public class Main {

	public static void main(String[] args) {
		//Conexion.conectar();
		UsuarioVO user = new UsuarioVO();
		user.setNombre("Luisa");
		user.setApellido("Acosta");
		user.setEmail("lulu@gmail.com");
		String[] datos = {"php","java","net"};
		UsuarioDAO.guardarUsuario(user);

	}

}
