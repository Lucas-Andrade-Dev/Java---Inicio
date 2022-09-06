package exercicios;

import java.util.Scanner;

public class aumentoSalario {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		double salario = 0;
		double nsalario = 0;
		double aumento = 0;
		
		System.out.println("Digite o salario atual do funcionario:");
		salario = s.nextDouble();
		
		if (salario <= 280) {
			aumento = (salario / 100) * 20;
			nsalario = salario * 1.20;
			System.out.println("Aumento de R$" + aumento + " Total de 20% de aumento");
		} else if (salario > 280 && salario <= 700) {
			aumento = (salario / 100) * 15;
			nsalario = salario * 1.15;
			System.out.println("Aumento de R$" + aumento + " Total de 15% de aumento");
		} else if (salario > 700 && salario <= 1500) {
			aumento = (salario / 100) * 10;
			nsalario = salario * 1.10;
			System.out.println("Aumento de R$" + aumento + " Total de 10% de aumento");
		} else if (salario > 1500) {
			aumento = (salario / 100) * 5;
			nsalario = salario * 1.05;
			System.out.println("Aumento de R$" + aumento + " Total de 5% de aumento");
		}

		System.out.println("Salario alterado para: R$" + nsalario);

	}

}
