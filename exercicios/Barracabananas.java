package exercicios;

import java.util.Scanner;

public class Barracabananas {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner (System.in);
		double ban = 0;
		double total = 0;
		boolean Ganhou = false;
		while (Ganhou==false) {
			System.out.println("Quantidade de bananas");
			ban = s.nextDouble();
			if(ban>=12) {total = ban*1;}else {total = ban*1.8;}
			System.out.println("Preco total: R$"+ total );
			
		}
		
		

	}

}
