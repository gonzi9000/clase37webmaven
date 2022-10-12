package com.proyecto.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.proyecto.modelo.UsuarioVO;

public class UsuarioDAO { //se encarga de insertar los datos en la base
	
	public static void guardarUsuario(UsuarioVO user) {
		try {
			Connection con = Conexion.conectar();
			PreparedStatement p = con.prepareStatement("INSERT INTO usuarios " + "(nombre,apellido,email,lenguajes) VALUES (?,?,?,?)");
			p.setString(1, user.getNombre());
			p.setString(2, user.getApellido());
			p.setString(3, user.getEmail());
			p.setString(4, user.getLenguaje());
			p.execute();
			System.out.println("Guardado los Datos");
			p.close();
			con.close();
			}catch(Exception e) {
			System.out.println("No puedo Guardar");
			e.printStackTrace();
		}
		
		    
	}

}
       