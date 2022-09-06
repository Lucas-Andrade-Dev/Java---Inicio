package exercicios;



import javax.swing.JOptionPane;

public class conjuntodeperguntas {



	public static void main(String[] args) {
		// Conjunto de perguntas primeira aula do curso
		
	
		
		String[] perguntas = {"Quanto é 25+5 ", "Quanto é 30 - 7 ", "Quanto é 34 . 32 ","98 - 38 = 60 "};
		String[] respostas = {"30", "3", "1088", "certa"};
		
		String r = "";
		int i = 3;
		boolean Ganhou = false;
		while (Ganhou == false) {
			if(i == 3) {
				JOptionPane.showMessageDialog(null,perguntas[i]+"Escreve se a questão esta certa ou errada: ");
				
				//System.out.println(perguntas[i]+ "Escreva se a Questão esta certa ou errada");
			}else {
				JOptionPane.showMessageDialog(null,perguntas[i]+"O resultado é? ");
				//System.out.println(perguntas[i]+ " O resultado é? ");
			}
			
			JOptionPane.showInputDialog("Digite sua respsta");
			//System.out.println("Digite sua resposta");
	           
	        
	        if(r.equals(respostas[i])) {
	        	System.out.println("Acertou");
	        	     i--;
	        }else {
	            System.out.println("Errou");
	            
	            
	        }
	  
		
		 if(i < 0) {
		 System.out.println("Parabens");
		 Ganhou = true;
		 }
		}
		 
	}
	
}

    


