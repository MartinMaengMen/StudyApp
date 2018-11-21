package serializado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	//1.- invocar al driver
	
	protected Connection conn;
	
	static{
	
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	//2.- invocar a la base de datos
	
	public Connection getConection(){
		//Solo cambiar estos datos al conectarse al SQL server.
		String server = "LAPTOP-T\\\\INSTANCIASQL";
		String database = "StudyAppdb";
		String user = "sa";
		String password = "andygeek";
		
		try {
			
			conn = DriverManager.getConnection("jdbc:sqlserver://"+server+":1433; databaseName = "+ database +"; user="+ user +"; password="+password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
