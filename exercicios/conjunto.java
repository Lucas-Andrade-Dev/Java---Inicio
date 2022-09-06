package exercicios;


import java.util.Scanner;

public class conjunto {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner (System.in);
		System.out.println("Quantidade: ");
		int quant = s.nextInt();
		String Fruta[] = new String[quant];
		for (int i=0; i<Fruta.length; i++) {
			System.out.println("Digite o nome de uma Fruta");
			String fruts = s.next();
			Fruta[i] = fruts;
		}
        for (int list=0; list<Fruta.length; list++) {
        	System.out.println(Fruta[list]);
        }
        
	}

}
