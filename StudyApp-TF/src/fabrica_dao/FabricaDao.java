package fabrica_dao;

import DAO.PreguntaDAO;

public abstract class FabricaDao {
	public static final int Sql=1;
	public static final int Oracle=2;
	public static final int MySQL=3;
	//Definir los DAOS
	public abstract PreguntaDAO getUsuarioDAO();
	/*Definir metodo de creacion para la implementacion de acuerdo al 
	pool de conexiones*/
	
 public static FabricaDao getFabricaDAO(int key){
	 switch (key) {
	 case Sql	:
		 return new SqlDAO_imple();
	
	}
	return null;
}
}