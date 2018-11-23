package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import objetos.CEstudiante;
import serializado.ConexionDB;

public class EstudianteDAOImpl implements EstudianteDAO{

	ConexionDB con;
	
	public EstudianteDAOImpl() {
		// TODO Auto-generated constructor stub
		con = new ConexionDB();
	}
	
	
	
	@Override
	public void insertar(CEstudiante t) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps = con.getConection()
				.prepareStatement("insert into Estudiante values("+
									+ t.getId()
									+",'"
									+t.getNombre()
									+"','"
									+t.getApellido()
									+"',"
									+t.getEdad()
									+","
									+t.getDNI()
									+",'"
									+t.getContrasenia()
									+"','"
									+t.getCorreo()
									+"',"
									+t.getCSede()
									+")");
		ps.executeUpdate();
		ps.close();
	}

	@Override
	public void listar() throws SQLException {
		// TODO Auto-generated method stub
		
		Statement st = con.getConection().createStatement();
		ResultSet rs = st.executeQuery("select * from Estudiante ");				
		System.out.println("Los estudiantes son: \n");
		while(rs.next()) {
			int Id = rs.getInt(1);
			String nombre = rs.getString(2);
			String apellido = rs.getString(3);
			String correo = rs.getString(6);
			System.out.println(Id + " - " + nombre + " - " + apellido  + " - " + correo);
		st.close();
		rs.close();
		}

	}
}
