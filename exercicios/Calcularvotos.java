package exercicios;

import java.util.Scanner;

public class Calcularvotos {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner (System.in);
		double bran,branp = 0;
		double nulu,nulup = 0;
		double vali,valip = 0;
		double totalvt;
		System.out.println("Digite A quantidade de votos Brancos");
		bran = s.nextDouble();
		System.out.println("Digite a quantidade de votos Nulus");
		nulu = s.nextDouble();
		System.out.println("Digite a quantidade de votos Validos");
		vali = s.nextDouble();
		totalvt=bran+nulu+vali;
		branp=(bran*100)/totalvt;
		nulup=(nulu*100)/totalvt;
		valip=(vali*100)/totalvt;
		System.out.printf("O Total de votos sao:  %.2f \n",totalvt);
		System.out.printf("O Percentoal de votos Brancos sao: %.2f \n",branp);
		System.out.printf("O Percentoal de votos Nulus sao: %.2f \n",nulup);
		System.out.printf("O Percentoal de votos Validos sao: %.2f \n",valip);
	

	}

}
