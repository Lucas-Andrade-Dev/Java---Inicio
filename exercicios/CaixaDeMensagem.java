package exercicios;

import javax.swing.JOptionPane;

public class CaixaDeMensagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = 0;
		String nome = "";
		String mens = "Ola ";
		boolean digite = true;
		while (digite == true) {
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		res = JOptionPane.showConfirmDialog(null, "O nome digitado foi " +nome);
		if(res==0) {
		JOptionPane.showMessageDialog(null, mens + nome);
		digite = false;
		}else if(res==2){
			digite = false;}else {
			JOptionPane.showMessageDialog(null,"Digite novamente");
		}
	    
		}
	}

}
