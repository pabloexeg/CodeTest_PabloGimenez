package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExerciseFiveDBConnection {
	
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:0000/xxxxxx";
	private Connection con = null;
	private String user = "XXXXXXX";
	private String password = "XXXXXXXX";

	// conexion a la base de datos mediante el metodo getconnection
	public ExerciseFiveDBConnection() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConexion() {
		return con;
	}

	public void closeConexion() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}