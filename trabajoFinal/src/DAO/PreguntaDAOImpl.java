package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import serializado.ConexionDB;

public class PreguntaDAOImpl implements PreguntaDAO {

	
	
	
	
	@Override
	public void insertar() throws SQLException {
		ConexionDB con = new ConexionDB();
		Statement st = con.getConection().createStatement();
		ResultSet rs = st.executeQuery("select * from Estudiante ");				
		System.out.println("Los estudiantes son: \n");
		while(rs.next()) {
			int Id = rs.getInt(1);
			String nombre = rs.getString(2);
			String apellido = rs.getString(3);
			String correo = rs.getString(6);
			System.out.println(Id + " - " + nombre + " - " + apellido  + " - " + correo);
		}
		
	}

}
