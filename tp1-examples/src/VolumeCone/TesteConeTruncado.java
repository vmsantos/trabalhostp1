package VolumeCone;

import java.util.Scanner;

public class TesteConeTruncado {

	public static void main(String[] args) {
		
		double Vc;
		
		ConeTruncado C1;
		C1 = new ConeTruncado();
		System.out.println("Valores Default de C1:");
		C1.Rb = 125 ;
		C1.Rm = 10;
		C1.G = 230;
		C1.ImprimirValores();
		
		
		ConeTruncado C2 = new ConeTruncado();
    	Scanner input = new Scanner(System.in);
    	
		System.out.println("Digitar o valor de Rb para C2:");
		C2.Rb = input.nextInt();
		
		System.out.println("Digitar o valor de Rm para C2:");
		C2.Rm = input.nextInt();
		
		
		System.out.println("Digitar o valor de G para C2:");
		C2.G = input.nextInt();
		
		Vc = C1.CalculoDoVolume();
		System.out.println("Valor do calculo de C1:"+Vc);
		System.out.println("Valor do calculo de C2:"+C2.CalculoDoVolume());
		
	}
	
	
}
