package Hotelaria;

public class Quarto {
	
	int id_quarto, nro_hospedes, hospede, id_fatura;
	double valor_diaria;
	
	public boolean AlugaQuarto(int id_cliente, int id_fatura, int valor_diaria) {
		
		this.id_quarto = 123456; //gera numero randomico
		this.hospede = id_cliente;
		this.valor_diaria = 100.00;
		
		
		return true;
		
	}
	
}
