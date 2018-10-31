package Database;

import java.sql.Connection;
import java.sql.ResultSet;

public class DatabaseConnection {
	
	public static void main (String [] args) {
	
		try {
			//1.Get a connection database
			Connection myConn = DatabaseConnection.getConnection("jdbc:mysql://localhost:3306/demo");
			//2.Create a statement
			Statement myStmt = my.Conn.createStattement();
			//3.Execute SQL query
			ResultSet myRs = myStmtm.executeQuery("select * from tb_cliente;");
			//4.Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("cliente_nome") + ", " + myRs.getString("cliente_cpf"));
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}
}

//https://www.youtube.com/watch?v=2i4t-SL1VsU