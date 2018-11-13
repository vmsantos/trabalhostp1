package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.mysql.jdbc.PreparedStatement;

public class DatabaseConnection {
	

	public class ConnectionFactory {
		
		private final String DRIVE = "com.mysql.jdbc.Driver";
		private final String URL = "jdbc:mysql://localhost:3306/hotelaria.db";
		private final String USER = "root";
		private final String PASS = "";
		
		public Connection getConnection() throws SQLException {
			
			try {
				Class.forName(DRIVE);
				return DriverManager.getConnection(URL, USER, PASS);
				
		}catch(ClassNotFoundException ex) {
			throw new RuntimeException("Erro ao conectar ao Banco de Dados do Hotelaria", ex);
		}	
	}
	}
	public static void CloseConnection(Connection con) { //Usar sobrecarga de métodos
				
		try {
			if(con != null) {
				con.close();
			}
		}catch(SQLException ex) {
			Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	public static void CloseConnection(Connection con, PreparedStatement stmt) { //Usar sobrecarga de métodos
		
		CloseConnection(con);
		
		try {
			if(stmt != null) {
				stmt.close();
			}
		}catch(SQLException ex) {
			Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	public static void CloseConnection(Connection con, PreparedStatement stmt, ResultSet rs) { //Usar sobrecarga de métodos
		
		CloseConnection(con);
		
		try {
			if(rs != null) {
				rs.close();
			}
		}catch(SQLException ex) {
			Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
//Criado por Marcos Paes em 13/11 as 02:34