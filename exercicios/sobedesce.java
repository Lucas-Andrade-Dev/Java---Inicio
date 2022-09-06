package exercicios;

import java.util.Scanner;

public class sobedesce {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner (System.in);
		int n1 = 0;	int cont = 1;
		System.out.println("Digite um numero");
		n1 = s.nextInt();
		while (cont<=n1) {System.out.println(cont);cont++;}
		while(cont>=1) {System.out.println(cont);cont--;}

	}

}
