package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastramentos_produtos {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		List<Produtos> produtos = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("--- Cadastramento ---");
		System.out.println("[1] Adicionar novo produto");
		System.out.println("[2] Listar produtos");
		System.out.println("[6] Sair");
		int opcao = sc.nextInt();
		sc.nextLine();
		
		switch(opcao) {
		case 1:
			System.out.print("Nome do produto: ");
			String nomeProduto = sc.nextLine();
			System.out.print("Preço: ");
			double precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidadeProduto = sc.nextInt();
			Produtos produto = new Produtos(nomeProduto, precoProduto, quantidadeProduto);
			produtos.add(produto);
			break;
		case 2:
			System.out.println("[Produtos registrados]");
			System.out.println(produtos.size() + " itens");
			for (Produtos prod : produtos) {
				System.out.println(prod);
			}
			break;
		case 6:
			System.out.println("Saindo...");
			sc.close();
			return;
		default:
			System.out.println("Opção inválida!");
		}
		}
	}
	

}
