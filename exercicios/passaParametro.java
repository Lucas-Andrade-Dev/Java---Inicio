package exercicios;

import javax.swing.JOptionPane;

public class passaParametro extends recebeParametro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1 = 0;
		double n2 = 0;
		int resp = 0;

		String calc = "";
		boolean sim = true;
		while (sim == true) {

			// n1 = Double.parseDouble(usa o Double.paseDouble Para formatar String em
			// numeros Dobrados(Double);
			// n2 = Integer.parseInt(Usa Integer para formatar String em Numeros
			// inteiros(int);

			n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
			calc = JOptionPane.showInputDialog("Digite o tipo da operação: +, -, x, /, Rq ");
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));

			if (calc.equals("+")) {
				JOptionPane.showMessageDialog(null, somaNumero(n1, n2));
			} else if (calc.equals("-")) {
				JOptionPane.showMessageDialog(null, subtraiNumero(n1, n2));
			} else if (calc.equals("x")) {
				JOptionPane.showMessageDialog(null, multiplicaNumero(n1, n2));
			} else if (calc.equals("/")) {
				JOptionPane.showMessageDialog(null, divideNumero(n1, n2));
			} else if (calc.equals("Rq")) {
				JOptionPane.showMessageDialog(null, raizQuadrada(n1, n2));
			} else {
				resp = JOptionPane.showConfirmDialog(null, "Nenhuma Operação foi Selecionada deseja voltar?");
			}
			if (resp >= 1) {
				sim = false;
			}

		}
	}

}
