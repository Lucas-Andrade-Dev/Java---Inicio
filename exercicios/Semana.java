package exercicios;

import java.util.Scanner;

public class Semana {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner (System.in);
		System.out.println("Digite um numero de 1 a 7");
		int n1 = s.nextInt();
		
		switch (n1) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
			default:
				System.out.println("Digite Apenas um numero de 1 a 7");
		}

	}

}
