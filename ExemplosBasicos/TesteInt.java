package ExemplosBasicos;

import java.util.Scanner;

public class TesteInt {
	
	private static Scanner s;

	public static void main (String[] arg) {
			
		s = new Scanner (System.in);
		
		//exemplo de numeros inteiros(numero inteiro não pode conter ponto e nem virgula)
		System.out.println("Digite um valor inteiro");
		int valor = s.nextInt();
		
		System.out.println("Voce Digitou: "+valor);
		
	}

}
