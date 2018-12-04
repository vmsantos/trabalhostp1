package Hotelaria;

import java.util.Scanner; //L� dados da tela
import Database.DatabaseConnection;
import java.util.Random; //Gera n�meros aleat�rios
import java.io.*;
import java.sql.SQLException;

public class Cliente {
	
		int id_hospede, conta, cpf_internet;
		String nome, endereco, banco, rg, cpf;
		
		Scanner ler = new Scanner(System.in);
		
		//Construtor Banco de dados
		DatabaseConnection databaseConnection = new DatabaseConnection();		
        
		//Verifica se h� cadastro de internet
		public int verificaCliente(String cpf) throws IOException, SQLException {
			
			int nro_quarto;
			
			System.out.println("Ok, informe o n�mero do seu cpf:");
			cpf_internet = ler.nextInt();
			
			//Parte a ser integrada com banco de dados
			if () {
				System.out.println("Seu quarto reservado � o");
			}
			else {
				System.out.println("� sua primeira loca�ao! Preencha seus dados.");
				PrimeiraLocacao(id_hospede);
			}
			
			return 1;
		}
		
		public void PrimeiraLocacao(int id_hospede) throws IOException, SQLException{
			//Formul�rio de cadatro de usu�rio
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Digite seu nome completo*");
			try {
				String nome = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Digite seu endere�o:*");
			String endereco = in.readLine();
			
			System.out.println("Digite o n�mero do seu RG:*");
			String rg = in.readLine();
						
			//Adaptar o banco de dados para receber estes dados
			System.out.println("Digite o nome do seu banco:");	
			String banco = in.readLine();
			
			System.out.println("Digite sua conta:");
			String conta = in.readLine();
			
			this.cpf = cpf;
			
			System.out.println("O cliente foi cadastrado com sucesso!");
			
			Quarto quarto1 = new Quarto();
			quarto1.AlugaQuarto(cpf);
			
			//Lan�a os dados de cadastro do cliente no banco de dados
			databaseConnection.Connection();
			//verifica se a camada de persistencia est� conectada ao banco
			if (databaseConnection != null) {
				databaseConnection.insereCliente(rg, cpf, nome, endereco);
				databaseConnection.desconectar();
			}
		}
}
