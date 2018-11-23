package DAO;

import java.sql.SQLException;


public interface IDAO<T> {
	public void insertar(T t) throws SQLException;
	public void listar() throws SQLException;
}
