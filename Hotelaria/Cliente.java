package Hotelaria;

import java.util.Scanner; //Lê dados da tela
import java.util.Random; //Gera números aleatórios
import java.io.*;

public class Cliente {
	
		int id_hospede, rg, cpf, conta, cad_internet = 3;
		String nome, endereco, banco;
		
		Scanner ler = new Scanner(System.in);
		
        
		//Verifica se o cliente é novo
		private void verificaCliente() {
	        
			while ((cad_internet != 1) && (cad_internet != 2)) {
				System.out.println("Você tem reserva feita pela internet? (1 - Sim / 2 - Não)");
				cad_internet = ler.nextInt(); 
			}
			
			if (cad_internet == 1) {
				System.out.println("Ok, ");
			}
			else if (cad_internet == 2) {
				System.out.println("É sua primeira locaçao! Preencha seus dados.");
				
				//Gerador de nº aleatórios: instância um objeto da classe Random usando o construtor padrão
		        Random gerador = new Random();
		        for (int i = 0; i < 100; i++) {
		        	id_hospede = gerador.nextInt(100);
		        }
		        
				PrimeiraLocacao(id_hospede);
			}
		}
		
		public void PrimeiraLocacao(int id_hospede) {
			//Formulário de cadatro de usuário
			
			System.out.println("Digite seu nome completo*");
			nome = ler.nextLine(); 	
			
			System.out.println("Digite seu endereço*");
			endereco = ler.nextLine(); 
			
			System.out.println("Digite o número do seu RG*");
			rg = ler.nextInt(); 
			
			System.out.println("Digite seu CPF*");
			cpf = ler.nextInt(); 
			
			System.out.println("Digite o nome do seu banco");	
			banco = ler.nextLine();
			
			System.out.println("Digite sua conta");
			conta = ler.nextInt(); 
		}
}

