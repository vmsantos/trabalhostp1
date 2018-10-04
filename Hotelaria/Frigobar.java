package Hotelaria;

import java.util.Scanner;

public class Frigobar {

	int  qtd_refigerante, qtd_cerveja, qtd_vodka, op;
	double preco_refrigerante = 5.00, preco_cerveja = 7.00, preco_vodka = 10.00;
	String cpf;
	
	Scanner ler = new Scanner(System.in);

	
	public void compraProduto(String cpf) {
		
		this.cpf = cpf;
		
		System.out.println("PRODUTOS DISPONÍVEIS NO FRIGOBAR:");
		System.out.println("");
		System.out.println("1 - Refrigerante...........R$ 5,00");
		System.out.println("2 - Cerveja................R$ 7,00");
		System.out.println("3 - Vodka.................R$ 10,00");
		System.out.println("");

		System.out.println("Digite o nro do produto escolhido:");
		op = ler.nextInt();
		
				
		this.cpf = cpf;
		
		Fatura Fatura1 = new Fatura();
		
		switch (op) {
		case 1:
			Fatura1.addItemFatura(cpf, preco_refrigerante);
			break;

		case 2:
			Fatura1.addItemFatura(cpf, preco_cerveja);
			break;
		case 3:
			Fatura1.addItemFatura(cpf, preco_cerveja);
			break;

		default:
			break;
		} 
	}
}	