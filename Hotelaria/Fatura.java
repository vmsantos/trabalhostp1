package Hotelaria;

import java.util.Random;

public class Fatura {

	int valor, vencimento, cliente;
    double valorInserido;
	public int incluiFatura(int id_cliente, int id_fatura, int valor, int vencimento) {
		
		this.cliente = id_cliente;
		this.valor = valor;
		this.vencimento = vencimento;
		
		if (id_fatura == 0 || id_fatura == 00 || id_fatura == 000 ) {
			
			//Gera o id_fatura (n� aleat�rio)
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
	
	public void addItemFatura(String cpf, double valor){
		 //Buscar a fatura na base de dados quando houver integra��o com bancos
		double valorAntigo = 0.00, valorNovo = 0.00, valorInserido = 0.00;
		this.valorInserido = valor;
		valorNovo = valorAntigo + valorInserido;
		
		if (valorNovo < 0.00)
			valorNovo = valorAntigo;
		
		System.out.println("O valor da sua fatura �: R$ " + Double.toString(valorNovo));
	}
	
	public void quitarFatura(String cpf){
		
		//soma de todas as faturas cadastradas para um cpf
		double valorTotal;
		valorTotal = 0.00;
		System.out.println("O valor total das suas faturas �: R$ " + Double.toString(valorTotal));
	}
}