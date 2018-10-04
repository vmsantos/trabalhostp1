package Hotelaria;

import java.util.Scanner; //Lê dados da tela
import java.util.Random; //Gera números aleatórios
import java.io.*;

public class Cliente {
	
	
		int id_hospede, conta, cad_internet = 3;
		String nome, endereco, banco, rg, cpf;
		
		Scanner ler = new Scanner(System.in);
		
        
		//Verifica se há cadastro de internet
		void verificaCliente(String cpf) throws IOException {
			System.out.println("Ok, informe o número do cadastro de internet:");
			cad_internet = ler.nextInt();
			
			//Parte a ser integrada com banco de dados
			if (cad_internet == 100) {
				System.out.println("Seu quarto reservado é o NÚMERO 02!");
			}
			else {
				System.out.println("É sua primeira locaçao! Preencha seus dados.");
				
				//Gerador de nº aleatórios: instância um objeto da classe Random usando o construtor padrão
		        Random gerador = new Random();
		        for (int i = 0; i < 100; i++) {
		        	id_hospede = gerador.nextInt(100);
		        }
		        
				PrimeiraLocacao(id_hospede);
			}
		}
		
		public void PrimeiraLocacao(int id_hospede) throws IOException{
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
