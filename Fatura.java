package Hotelaria;

public class Fatura {

	int fatura, valor, vencimento, cliente;
	
	public int incluiFatura(int id_cliente, int id_fatura) {
		
		this.cliente = id_cliente;
		this.fatura = id_fatura;
		this.valor = valor;
		this.vencimento = vencimento;
		
		if (fatura == 0 || fatura == 00 || fatura == 000 ) {
			id_fatura = 123; //Ajustar para gerar o numero randomico
			System.out.println("A fatura foi gerada para o cliente");
		}
		else
			System.out.println("O cliente possui uma fatura em aberto");

		
		return this.fatura;
	}
	
	public int addItemFatura(int id_fatura, int valor, int valorInserido) {
		
		int valorAntigo, valorNovo;
		
		this.fatura = id_fatura;
		valorAntigo = valor;
		valorNovo = valorAntigo + valorInserido;
		
		return valorNovo;
	}
}
