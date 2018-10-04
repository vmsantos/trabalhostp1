package Hotelaria;

import java.util.Random; //Gera ID Quarto
import java.util.Scanner;

public class Quarto {
	
	int id_quarto, nro_hospedes, id_fatura, op;
	double valor_diaria;
	String cpf;
	boolean climatizado;
	
	Scanner ler = new Scanner(System.in);

	public void AlugaQuarto(String cpf) {
		
		//Gera o id_quarto (nº aleatório)
		Random gerador = new Random();
        for (int i = 0; i < 100; i++) {
        	id_quarto = gerador.nextInt(100);
        }
        
        this.nro_hospedes = 3;
        this.valor_diaria = 50.00;
        this.climatizado = true;
        this.cpf = cpf;
        
        
        System.out.println("Quarto reservado com sucesso!");
        System.out.println("");
		System.out.println("Precisa comprar algum produto (1 - Sim/ 2- Não)");
		op = ler.nextInt();
		
		if (op == 1) {
			Frigobar quarto1 = new Frigobar();
			quarto1.compraProduto(cpf);
		}
		else {
			System.out.println("Precisa comprar de algum serviço (1 - Sim/ 2- Não)");
			op = ler.nextInt();
		}
	}
	
}