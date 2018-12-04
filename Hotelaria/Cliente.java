package Hotelaria;

import java.util.Scanner; //Lê dados da tela
import Database.DatabaseConnection;
import java.util.Random; //Gera números aleatórios
import java.io.*;
import java.sql.SQLException;

public class Cliente {
	
		int id_hospede, conta, cpf_internet;
		String nome, endereco, banco, rg, cpf;
		
		Scanner ler = new Scanner(System.in);
		
		//Construtor Banco de dados
		DatabaseConnection databaseConnection = new DatabaseConnection();		
        
		//Verifica se há cadastro de internet
		public int verificaCliente(String cpf) throws IOException, SQLException {
			
			int nro_quarto;
			
			System.out.println("Ok, informe o número do seu cpf:");
			cpf_internet = ler.nextInt();
			
			//Parte a ser integrada com banco de dados
			if () {
				System.out.println("Seu quarto reservado é o");
			}
			else {
				System.out.println("É sua primeira locaçao! Preencha seus dados.");
				PrimeiraLocacao(id_hospede);
			}
			
			return 1;
		}
		
		public void PrimeiraLocacao(int id_hospede) throws IOException, SQLException{
			//Formulário de cadatro de usuário
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Digite seu nome completo*");
			try {
				String nome = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Digite seu endereço:*");
			String endereco = in.readLine();
			
			System.out.println("Digite o número do seu RG:*");
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
			
			//Lança os dados de cadastro do cliente no banco de dados
			databaseConnection.Connection();
			//verifica se a camada de persistencia está conectada ao banco
			if (databaseConnection != null) {
				databaseConnection.insereCliente(rg, cpf, nome, endereco);
				databaseConnection.desconectar();
			}
		}
}
