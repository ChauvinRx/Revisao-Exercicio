package agenda_contatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
	
	List<Contato> contatos = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Agenda agenda = new Agenda();
		boolean executando = true;
		
		while(executando){
		System.out.println("Digite o número correspondente para selecionar a opção desejada");
		System.out.println("[1] Adicionar contato");
		System.out.println("[2] Remover contato");
		System.out.println("[3] Atualizar contato");
		System.out.println("[4] Exibir contatos");
		System.out.println("[5] Sair");
		int opcao = sc.nextInt();
		sc.nextLine();
		
		switch(opcao) {
		case 1:
			agenda.adicionarContato();
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}
		
		}
		
		sc.close();
	}
	
	public void adicionarContato() {
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Telefone: ");
		String telefone = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		Contato contato = new Contato(nome, telefone, email);
		contatos.add(contato);
	}

}
