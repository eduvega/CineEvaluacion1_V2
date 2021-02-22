package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexion.Conexion;
import modelo.Administrador;

/**
 * The Class AdministradorDao.
 */
public class AdministradorDao {
	
	
	/**
	 * Select admin.
	 *
	 * @param user the user
	 * @return the administrador
	 */
	public Administrador selectAdmin(String user) {
		Administrador admin = null;
		
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			conn = Conexion.conectar();
			preparedStatement = conn.prepareStatement("SELECT * FROM administrador WHERE nombre = ?");
			preparedStatement.setString(1, user);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.absolute(1) == true) {
				String nombre = resultSet.getString("nombre");
				String pass = resultSet.getString("pass");
				
				admin = new Administrador(nombre, pass);				
			}


		} catch (SQLException e) {
			e.printStackTrace(System.out);
		} finally {
			if (resultSet != null) {
				Conexion.close(resultSet);
			}
			if (preparedStatement != null) {
				Conexion.close(preparedStatement);
			}
			if (conn != null) {
				Conexion.close(conn);
			}
		}
		return admin;
	}
	
	/**
	 * Insertar administrador. Metodo que se utuliza par crear nuevos admins
	 *
	 * @param admin the admin
	 */
	public void insertarAdministrador(Administrador admin) {

		Connection conn = null;
		PreparedStatement preparedStatement = null;

		try {
			conn = Conexion.conectar();
			preparedStatement = conn.prepareStatement("INSERT INTO administrador (nombre, pass) VALUES (?,?)");
			preparedStatement.setString(1, admin.getNombre());
			preparedStatement.setString(2, admin.getPass());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		} finally {
			if (preparedStatement != null) {
				Conexion.close(preparedStatement);
			}
			if (conn != null) {
				Conexion.close(conn);
			}
		}
	}
}
