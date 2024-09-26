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
		case 2:
			agenda.removerContato();
			break;
		case 3:
			agenda.atualizarContato();
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
		System.out.println("O contato foi adicionado!");
	}
	
	public void removerContato() {
		System.out.print("Nome do contato que vai remover: ");
		String nome = sc.nextLine();
		for(Contato x : contatos) {
			if(nome.equalsIgnoreCase(x.getNome())) {
				contatos.remove(x);
				System.out.println("O contato " + x.getNome() + " foi removido");
			}else {
				System.out.println("Contato não existente");
			}
		}
	}
	
	public void atualizarContato() {
		System.out.print("Digite o nome do contato que deseja atualizar: ");
        String nome = sc.nextLine();
        Contato contato = null;
        
		for(Contato x : contatos) {
			if(nome.equalsIgnoreCase(x.getNome())) {
				contato = x;
				break;
			}
		}
		if(contato != null) {
            // Pergunta os novos dados
            System.out.print("Novo nome (ou pressione Enter para manter): ");
            String novoNome = sc.nextLine();
            if (!novoNome.isEmpty()) {
                contato.setNome(novoNome);
            }

            System.out.print("Novo telefone (ou pressione Enter para manter): ");
            String novoTelefone = sc.nextLine();
            if (!novoTelefone.isEmpty()) {
                contato.setTelefone(novoTelefone);
            }

            System.out.print("Novo email (ou pressione Enter para manter): ");
            String novoEmail = sc.nextLine();
            if (!novoEmail.isEmpty()) {
                contato.setEmail(novoEmail);
            }
            System.out.println("Contato atualizado com sucesso!");
        }else {
            System.out.println("Contato não encontrado.");
        }	
	}

}
