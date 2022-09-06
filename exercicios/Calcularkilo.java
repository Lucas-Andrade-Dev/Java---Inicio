package exercicios;

import java.util.Scanner;

public class Calcularkilo {
	
	
	private static Scanner peso;
	private static Scanner codigo;
	private static Scanner imposto;

	public static void main (String[] args) {
		
		peso = new Scanner (System.in);
		codigo = new Scanner (System.in);
		imposto = new Scanner (System.in);
		
		double pesokilo=0, pesograma=0, precoporgrama=0;
		int cod=0; 
		int codpais=0; 
		double impos = 0;
		double precototal=0;
		
		System.out.println("insira um codigo de 1 a 10");
		cod = codigo.nextInt();
		   	    	
	    System.out.println("Insira o codigo do pais de 1 a 3");
		codpais=imposto.nextInt();
		
		  System.out.println("Informe o Kilo: ");
		  pesokilo = peso.nextDouble();
		    
		  pesograma= pesokilo*1000;
		  		 
		 if (cod >= 1 && cod <=4) {
			 precoporgrama=10;
		 }else
		 
		 if (cod >= 5 && cod <=7) {
			 precoporgrama=25;
		 }else
		 
		 if (cod >= 8 && cod <=10) {
			 precoporgrama=35;
		 }
		 
		 precototal=precoporgrama*pesograma;
		 
		 if (codpais==1) {
			 impos=0;  
		 }else
		 
		 if(codpais==2) {
			 impos=precototal*0.15;
		 }else
		 
		 if (codpais==3) {
			 impos=precototal*0.25;
		 
		 }
		 
		 precototal=precototal+impos;
		   				 
		 System.out.printf("Kilos convertidos em Gramas: %.2f \n ", pesograma);
		 System.out.printf("Imposto sobre o codigo do pais: R$ %.2f \n",impos);
		 System.out.printf("Preco total:R$ %.2f \n", precototal);
		 
		 
		
	    
	} 
		
		
		
		
	  
	}


