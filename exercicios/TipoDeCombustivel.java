package exercicios;

import java.util.Scanner;

public class TipoDeCombustivel {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner (System.in);
	
       double Alc = 1.90, Gas = 2.70;
       double lt =0; 
       double total=0;
       boolean Repetir = false;
       while (Repetir == false) {
    	
    	String comb;
    	   
        System.out.println("Litros: ");
        lt = s.nextDouble();
        System.out.println("Digite A (Para alcool) ou G (Para Gasolina)");
        comb = s.next();
        if(comb.equals("A")) {
        	total= Alc*lt;
        	System.out.println("Litros de Alcool: "+lt+"LTs");
        }else if(comb.equals("G")){
        	  total = Gas*lt;
        	  System.out.println("Litros de Gasolina "+lt+"LTs");
        }
        
        System.out.printf("Total A Pagar:R$%.2f \n",total);       
    	
       }
	}

}
