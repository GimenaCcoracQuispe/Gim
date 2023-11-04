package pe.edu.vallegrande.AS222_T13.prueba;

import java.sql.Connection;
import java.sql.SQLException;

import pe.edu.vallegrande.AS222_T13.db.AccesoDB;

public class Prueba01 {
	
	public static void main(String[] args) {
		try {
			Connection cn = AccesoDB.getConnection();
			System.out.println("Conexion ok");
			cn.close();
		} catch (SQLException e) {
			System.err.print(e.getMessage());
		}
	}
}
