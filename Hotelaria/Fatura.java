package Hotelaria;

import java.util.Random;

public class Fatura {

	int valor, vencimento, cliente;
	
	public int incluiFatura(int id_cliente, int id_fatura) {
		
		this.cliente = id_cliente;
		this.valor = valor;
		this.vencimento = vencimento;
		
		if (id_fatura == 0 || id_fatura == 00 || id_fatura == 000 ) {
			
			//Gera o id_fatura (nº aleatório)
			Random gerador = new Random();
	        for (int i = 0; i < 100; i++) {
	        	id_fatura = gerador.nextInt(100);
	        }
	        //converter id_
			System.out.println("A fatura foi gerada para o cliente");
		}
		else
			System.out.println("O cliente possui uma fatura em aberto");

		
		return id_fatura;
	}
	
	public int addItemFatura(int id_fatura, int valor, int valorInserido) {
		
		int valorAntigo, valorNovo;
		
		valorAntigo = valor;
		valorNovo = valorAntigo + valorInserido;
		
		return valorNovo;
	}
}
