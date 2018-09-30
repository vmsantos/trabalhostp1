package Hotelaria;

import java.util.Scanner; //L� dados da tela
import java.util.Random; //Gera n�meros aleat�rios
import java.io.*;

public class Cliente {
	
		int id_hospede, rg, cpf, conta, cad_internet = 3;
		String nome, endereco, banco;
		
		Scanner ler = new Scanner(System.in);
		
        
		//Verifica se o cliente � novo
		private void verificaCliente() {
	        
			while ((cad_internet != 1) && (cad_internet != 2)) {
				System.out.println("Voc� tem reserva feita pela internet? (1 - Sim / 2 - N�o)");
				cad_internet = ler.nextInt(); 
			}
			
			if (cad_internet == 1) {
				System.out.println("Ok, ");
			}
			else if (cad_internet == 2) {
				System.out.println("� sua primeira loca�ao! Preencha seus dados.");
				
				//Gerador de n� aleat�rios: inst�ncia um objeto da classe Random usando o construtor padr�o
		        Random gerador = new Random();
		        for (int i = 0; i < 100; i++) {
		        	id_hospede = gerador.nextInt(100);
		        }
		        
				PrimeiraLocacao(id_hospede);
			}
		}
		
		public void PrimeiraLocacao(int id_hospede) {
			//Formul�rio de cadatro de usu�rio
			
			System.out.println("Digite seu nome completo*");
			nome = ler.nextLine(); 	
			
			System.out.println("Digite seu endere�o*");
			endereco = ler.nextLine(); 
			
			System.out.println("Digite o n�mero do seu RG*");
			rg = ler.nextInt(); 
			
			System.out.println("Digite seu CPF*");
			cpf = ler.nextInt(); 
			
			System.out.println("Digite o nome do seu banco");	
			banco = ler.nextLine();
			
			System.out.println("Digite sua conta");
			conta = ler.nextInt(); 
		}
}

