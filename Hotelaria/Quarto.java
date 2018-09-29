package Hotelaria;

import java.util.Random;

public class Quarto {
	
	int id_quarto, nro_hospedes, hospede, id_fatura;
	double valor_diaria;
	boolean climatizado;
	
	public boolean AlugaQuarto(int id_cliente, int id_fatura, int valor_diaria) {
		
		//Gera o id_quarto (nº aleatório)
		Random gerador = new Random();
        for (int i = 0; i < 100; i++) {
        	id_quarto = gerador.nextInt(100);
        }
        
        
		
		return true;
	}
	
}
