package ExemplosBasicos;

import java.io.IOException;
import java.util.Scanner;

public class TesteComwhile {
	
	private static Scanner ler;

	public static void main(String[]args) {
		
		ler = new Scanner(System.in);
		
		int idade =0;   char sexo=0;
		String nome="";
		
		//aqui testei o do while, metodo de repetição para validar uma informação
		
		do {
		System.out.println("Digite Seu Nome: (No Minino 5 e no Maximo 10 caracteres)");
		nome = ler.next();
		
		}while(nome.length()<5 || nome.length() >10);
		
		do {
			try {
			System.out.println("Digite Seu Sexo: M ou F");
		    	sexo = (char) System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}while(sexo!= 'M' && sexo != 'F');
		
		do {
			System.out.println("Digite Sua Idade: ");
			idade = ler.nextInt();
			
			}while(idade<=0);
			
		
	}

}
