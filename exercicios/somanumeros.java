package exercicios;

import java.util.Scanner;

public class somanumeros {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		double n1 = 0;
		double n2 = 0;
		double result; 
		System.out.println("Digite sua primeira nota");
		n1 = s.nextDouble();
		System.out.println("Digite sua segunda nota");
		n2 = s.nextDouble();
		result = (n1 + n2)/2;
		System.out.println("Resultado "+result);
		s.close();
		
		if(result >= 50) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}

	}

}
