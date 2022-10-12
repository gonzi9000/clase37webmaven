package com.proyecto.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
	static Connection con = null;
	public static Connection conectar() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/proyecto","root","");
			System.out.println("Conexion exitosa");
		}catch(Exception e) {
			System.out.println("Error de conexion");
			e.printStackTrace();
		}
		return con;
	}
}
