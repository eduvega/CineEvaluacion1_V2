package conexion;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Conexion para la base de datos.
 */
public class Conexion {
	
	/** The Constant JDBC_DRIVER. */
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	/** The Constant DB_URL. */
	private static final String DB_URL = "jdbc:mysql://localhost/cine";
	
	/** The Constant DB_USER. */
	private static final String DB_USER = "root";
	
	/** The Constant DB_PASS. */
	private static final String DB_PASS = "";
	
	/**
	 * Metodo para crear la conexion con la base de datos.
	 *
	 * @return la conexion con mysql
	 */
	public static Connection conectar() {
		Connection conn = null;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
		} catch (ClassNotFoundException e) {
			System.out.println("Loading driver error");
			e.printStackTrace(System.out);
		} catch (SQLException e) {
			System.out.println("Connection error");
			e.printStackTrace(System.out);
		}
		return conn;
	}
	
	/**
	 * Metodo para cerrar la herramienta Resulset.
	 *
	 * @param resultSet the result set
	 */
	public static void close(ResultSet resultSet) {
		try {
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
	}
	
	/**
	 * Metodo para cerrar la herramienta PreparedStatement.
	 *
	 * @param preparedStatement the prepared statement
	 */
	public static void close(PreparedStatement preparedStatement) {
		try {
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
	}
	
	/**
	 * Metodo para cerrar la conexion con la base de datos.
	 *
	 * @param conn the conn
	 */
	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
	}
}
