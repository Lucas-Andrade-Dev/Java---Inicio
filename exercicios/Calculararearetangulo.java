package exercicios;

import java.util.Scanner;

public class Calculararearetangulo {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		double larg, altu = 0;
		double area = 0;
		System.out.println("Digite a largura do retangulo");
		larg = s.nextDouble();
		System.out.println("Digite a Altura do retangulo");
		altu = s.nextDouble();
		area = larg * altu;
		System.out.println("A area do Retangulo é de: " + area + "cm");

	}

}
