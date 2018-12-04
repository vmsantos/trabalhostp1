package Database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Generated;

import com.mysql.jdbc.PreparedStatement;

public class DatabaseConnection {
	
	public int id;
	private Connection connection;
	private Statement statement;
		
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/hotelaria.db"; //Baseado na importação do model "Hotelaria"
	private static final String USER = "root";
	private static final String PASS = "";
	private String queryReserva;
		
	public void Connection() throws SQLException {
			
			try {
				Class.forName(DRIVER);
				this.connection = DriverManager.getConnection(URL, USER, PASS);
				this.statement = this.connection.createStatement();
				
			}
			catch(ClassNotFoundException ex) {
				throw new RuntimeException("Erro ao conectar ao Banco de Dados do Hotelaria", ex);
			}	
	}
		
	public boolean estaConectado() {
			if (this.connection != null)
				return true;
			else
				return false;
	}
	
	public static void CloseConnection(Connection con) { //Usar sobrecarga de métodos
				
			try {
				if(con != null) {
				con.close();
				}
			}
			catch(SQLException ex) {
				Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
			}
	}
	
	public static void CloseConnection(Connection con, PreparedStatement stmt) { //Usar sobrecarga de métodos
		
		CloseConnection(con);
		
		try {
			if(stmt != null) {
				stmt.close();
			}
		}
		catch(SQLException ex) {
			Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	public static void CloseConnection(Connection con, PreparedStatement stmt, ResultSet rs) { //Usar sobrecarga de métodos
		
		CloseConnection(con);
		
		try {
			if(rs != null) {
				rs.close();
			}
		}catch(SQLException ex) {
			Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	public void desconectar() {
		try {
			//DESCONECTAR DO BANCO
			
		}
		catch (Exception ex) {
			System.out.println("Não foi possível desconectar do banco de dados!");
		}	
	}
	
	public void insereCliente(String rg, String cpf, String nome, String endereco) {
				
		id = id + 1;
		try {
			String queryInsere = "INSERT INTO tb_cliente (id_cliente, cliente_nome, cliente_rg, cliente_cpf, cliente_endereco) VALUES ('"
			+ id + "', '" + rg + "', '" + cpf +"', '"+ nome + "', '" + endereco +"');";
			
			//Executa a query montada
			this.statement.executeQuery(queryInsere);
		}
		catch (Exception ex) {
			System.out.println("Não foi possível salvar os dados do cliente no banco de dados!");
		}
	}
	
	public void verificaCliente(String cpf_cliente) throws SQLException {
		
		
		if (cpf_cliente.length() < 11 || cpf_cliente.length() > 11) 
			System.out.println("Erro: O CPF está incorreto");
		else {
			String queryConsulta = "SELECT * FROM tb_cliente WHERE cliente_cpf = " + cpf_cliente + ";";
			this.statement.executeQuery(queryConsulta);
		}
	}
	
	public void reservaQuarto (String cpf) throws SQLException {
		
		queryReserva = "SELECT * FROM tab_cliente WHERE cliente_cpf = '" +cpf +"'";
		this.statement.executeUpdate(queryReserva);
		
		if 	(queryReserva.isEmpty()) {
			//Criar um quarto-fatura para aquele cliente
			
		}else {
			System.out.println("Não há quartos reservados para o CPF inseido.");
		}
	}
	
}
//Criado por Marcos Paes em 13/11 as 02:34
//https://www.youtube.com/watch?v=80tZQFicXn4
