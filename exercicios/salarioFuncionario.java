package exercicios;

import java.util.Scanner;


import modulo.Funcionario;

public class salarioFuncionario {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();

		System.out.println("Quantidade de funcionarios que deseja cadastrar:");
		int num = s.nextInt();

		// double salario =0;
		double salario = 0;
		int lis = 0;
		int i = 0;
		int cd = 0;
		String dadosn[] = new String[num];
		String dadossal[] = new String[num];
		String cod[] = new String[num];

		for (lis = 0; lis < dadosn.length; lis++) {
			System.out.println("Digite o nome do funcionario");
			String nome = s.next();
			dadosn[lis] = nome;
			funcionario.setNome(nome);
		}

		for (i = 0; i < dadossal.length; i++) {
			System.out.println("Digite o salario de: " + dadosn[i]);
			String salar = s.next();
			dadossal[i] = salar;
			salario = Double.valueOf(salar).doubleValue();
			funcionario.setSalario(salario);

		}
		for (cd = 0; cd < cod.length; cd++) {
			cod[cd] = dadosn[cd] + dadossal[cd];

		}
		for (int teste = 0; (teste < dadosn.length && teste < dadossal.length); teste++) {
			System.out.println(cod[teste]);

		}
	}
}
// funcionario.setCod(num);
/// funcionario.setNome(nome);
// funcionario.setSalario(salario);
