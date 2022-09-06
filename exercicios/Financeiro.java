package exercicios;

import java.util.Scanner;

public class Financeiro {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		double renda = 0;
		double emcjuros = 0;
		int qtdprest = 0;
		double juros = 2.5;
		double vlrprest = 0;
		double emprest = 0;
		double total;
		System.out.println("Digite sua renda: ");
		renda = s.nextDouble();
		System.out.println("Digite o valor do emprestimo desejado: ");
		emprest = s.nextDouble();
		System.out.println("Digite a quantidade de parcelas: ");
		qtdprest = s.nextInt();
		if (qtdprest > 12) {
			total = juros * qtdprest;
			emcjuros = emprest + total;
			vlrprest = emcjuros / qtdprest;
		} else {
			vlrprest = emprest / qtdprest;
		}

		if (emprest <= (renda * 10) && vlrprest <= (0.3 * renda)) {
			System.out.println("Emprestimo De R$" + emprest);
			System.out.println("Parcelado em " + qtdprest + "x De:R$" + vlrprest);
			System.out.println("Foi Aprovado com sucesso");

		} else {
			System.out.println("Emprestimo Negado");
		}

	}

}
