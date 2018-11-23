package fabrica_dao;

import DAO.PreguntaDAO;
import DAO.PreguntaDAOImpl;

public class SqlDAO_imple extends FabricaDao {

	@Override
	public PreguntaDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new PreguntaDAOImpl();
	}

}
