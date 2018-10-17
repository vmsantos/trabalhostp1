package Hotelaria;

import java.util.Scanner; //L� dados da tela
import java.util.Random; //Gera n�meros aleat�rios
import java.io.*;

public class Cliente {
	
	
		int id_hospede, conta, cad_internet = 3;
		String nome, endereco, banco, rg, cpf;
		
		Scanner ler = new Scanner(System.in);
		
        
		//Verifica se h� cadastro de internet
		void verificaCliente(String cpf) throws IOException {
			System.out.println("Ok, informe o n�mero do cadastro de internet:");
			cad_internet = ler.nextInt();
			
			//Parte a ser integrada com banco de dados
			if (cad_internet == 100) {
				System.out.println("Seu quarto reservado � o N�MERO 02!");
			}
			else {
				System.out.println("� sua primeira loca�ao! Preencha seus dados.");
				
				//Gerador de n� aleat�rios: inst�ncia um objeto da classe Random usando o construtor padr�o
		        Random gerador = new Random();
		        for (int i = 0; i < 100; i++) {
		        	id_hospede = gerador.nextInt(100);
		        }
		        
				PrimeiraLocacao(id_hospede);
			}
		}
		
		public void PrimeiraLocacao(int id_hospede) throws IOException{
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
						
			System.out.println("Digite o nome do seu banco:");	
			String banco = in.readLine();
			
			System.out.println("Digite sua conta:");
			String conta = in.readLine();
			
			this.cpf = cpf;
			
			System.out.println("O cliente foi cadastrado com sucesso!");
			
			Quarto quarto1 = new Quarto();
			quarto1.AlugaQuarto(cpf);
		}
}
