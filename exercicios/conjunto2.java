package exercicios;




import javax.swing.JOptionPane;

public class conjunto2 {

	public static void main(String[] args) {
	
     String Frutas[] = new String [3];
     Frutas[0] = "Uva";
     Frutas[1] = "Morango";
     Frutas[2] = "Banana";
     for (int i=0; i < Frutas.length; i++) {
    	 
    	 if(Frutas[i].equals("Uva")) {
    		 
   
    		JOptionPane.showMessageDialog(null,Frutas[0]+" R$1,00");
    		 
    		 }else if (Frutas[i].equals("Morango")) 
    	{
      	 JOptionPane.showMessageDialog(null,Frutas[1]+ " R$2,00");
      	 
    	   }else if (Frutas[i].equals("Banana")) 
    		   
    	{   
    		   JOptionPane.showMessageDialog(null,Frutas[2]+" R$4,00");
    	}
    	 
    	 
    	}
    	 
    	 }
    	 
     }
     
	


