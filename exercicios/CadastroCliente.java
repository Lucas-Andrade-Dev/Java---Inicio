package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

import modulo.ClientesDados;

public class CadastroCliente {

	private static Scanner snome;
	private static Scanner s;
	private static Scanner stelefone;
	private static Scanner scodigo;

	public static void main(String[] args) {
	  s = new Scanner(System.in);
      snome = new Scanner(System.in);
      stelefone = new Scanner(System.in);
      scodigo = new Scanner(System.in);
      int cod=0; String nome =""; String telefone = ""; int op=0;
      
      ArrayList<ClientesDados> listaclientes = new ArrayList<>();
      
      System.out.println("--------------Menu-------------");
      System.out.println("          1 Cadastro");
      System.out.println("          2 Lista");
      System.out.println("          3 Sair");
      System.out.println("-------------------------------");
      
      while(op!=3) {
    	  System.out.println("Escolha uma opção");
    	  op = s.nextInt();
    	  ClientesDados clientes = new ClientesDados();
    	  switch (op) {
		case 1: 
			System.out.println("Cadastre o codigo do cliente:");
			cod = scodigo.nextInt(); 
			scodigo.nextLine();
			System.out.println("Escreva o nome do cliente: ");
			nome = snome.nextLine();
			System.out.println("Escreva o telefone do cliente: ");
			telefone= stelefone.nextLine();
			
			clientes.setCodigo(cod);
			clientes.setNome(nome);
			clientes.setTelefone(telefone);
			listaclientes.add(clientes);
			break;
		case 2:
			for (ClientesDados c : listaclientes) {
				System.out.println("Codigo: "+c.getCodigo());
				System.out.println("Nome: "+c.getNome());
				System.out.println("Telefone: "+c.getTelefone());
			} break;
		case 3: 
			System.out.println("Fechando Sistema");
			break;
			default:
				System.out.println("Digite Apenas Os numeors Informados");
				 System.out.println("--------------Menu-------------");
			      System.out.println("          1 Cadastro");
			      System.out.println("          2 Lista");
			      System.out.println("          3 Sair");
			      System.out.println("-------------------------------");
		
			
      }
	}

      }

	}
