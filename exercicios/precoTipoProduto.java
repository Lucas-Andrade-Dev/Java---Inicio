package exercicios;

import java.util.Scanner;

public class precoTipoProduto {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		s = new Scanner (System.in);
		double preco=0; double preconovo =0;
		double desconto=0; double imposto=0;
		int porceim =0; double valoradc = 0;
		String tipo = ""; String refrig = "";
		String Class="";
		
		System.out.println("Escolha o tipo do produto sendo: A (Alimentos) L (Limpeza) V(Vestuario)");
		tipo= s.next();
		
		switch (tipo) {
		case "A": 
		case "L":	
		case "V":
			
			
		System.out.println("Este produto é Refrigerado? Digite S (Sim) ou N (Não)");
		refrig=s.next();
		
		switch(refrig) {
		case"S":
		case"N":
		
		System.out.println("Digite o preço do produto:");
		preco=s.nextDouble();
		
		if(tipo.equals("A") && refrig.equals("S")) {
			valoradc=8;
			desconto=(preco*3)/100;
		}else if (tipo.equals("A") && refrig.equals("N")) {
			
			if(preco<15) {
				valoradc=2;
			}else if(preco>=15) {
				valoradc=5;
			}
		}
           if (tipo.equals("L") && refrig.equals("N")) {
			
			if(preco<10) {
				valoradc=1.50;
			}else if(preco>=10) {
				valoradc=2.50;
			}
		}
           if (tipo.equals("V") && refrig.equals("N")) {
   			
   			if(preco<30) {
   				valoradc=3;
   			}else if(preco>=30) {
   				valoradc=2.50;
   			}
   		}
           preco=preco+valoradc;
           
           if(preco<25) {
        	   imposto=(preco*5)/100;
        	   porceim=5;
           }else if (preco>=15) {
        	   imposto=(preco*8)/100;
        	   porceim=8;
           }
           
           preconovo=preco+imposto-desconto;
           
           if(preconovo<=50) {
        	   Class = "Barato";
        	   
           }else if(preconovo>50 && preconovo<100) {
        	   Class = "Normal";
           }else if (preconovo>=100) {
        	   Class="Caro";
           }
           
           System.out.println("Valor Adicionado ao produto: R$"+valoradc);
           System.out.println("Preco do produto com o valor adicional: R$"+preco);
           System.out.println("Imposto sobre o produto foi de "+porceim+"% ficando R$"+imposto);
           System.out.println("Desconto sobre o produto: R$"+desconto);
           System.out.println("Novo preco do produto: R$"+preconovo);
           System.out.println("Este produto esta classificado como: "+Class);
           
           break;
           default:System.out.println("Operacao invalida");
		}
           break;
           default:System.out.println("Operacao invalida");
           
		}

	}

}
