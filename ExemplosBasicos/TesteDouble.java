package ExemplosBasicos;

import java.util.Scanner;

public class TesteDouble {
	
	private static Scanner s;

	public static void main (String[] arg) {
		
		s = new Scanner (System.in);
		
		//a Variavel double pode conter numeros quebrados que possuem ponto e virgula
		System.out.println("Digite uma variavel Double: ");
		double valor = s.nextDouble();
		
		System.out.println("O valor que voce digitou foi: "+valor);
		
		
	}
	
	

}
