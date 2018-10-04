package Hotelaria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Hotel {

	private static Scanner ler;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int op = 3;
		
		System.out.println("#############################################");
		System.out.println("BEM VINDO AO SISTEMA DE CONTROLE DE HOTELARIA");
		System.out.println("");
		System.out.println("#############################################");
		
		System.out.println("MENU:");
		System.out.println("");
		System.out.println("1 - Quarto reservado pela internet");
		System.out.println("2 - Reservar um quarto");
		System.out.println("3 - Comprar um produto");
		System.out.println("4 - Quitar sua fatura");
		System.out.println("");
		System.out.println("#############################################");
		
		ler = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		while (op != 1) {
			System.out.println("Digite sua opção:");
			op = ler.nextInt();		
		}
						
		if (op == 1) {
			System.out.println("Digite seu CPF:");
			String cpf = in.readLine();
			Cliente Cliente = new Cliente();
			Cliente.verificaCliente(cpf);
			
			
		}else {
			
		}
	}

}
