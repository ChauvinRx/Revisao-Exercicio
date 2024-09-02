package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastramentos_produtos {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		List<Produtos> produtos = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		boolean executando = true;
		
		while(executando) {
		System.out.println("--- Cadastramento ---");
		System.out.println("[1] Adicionar novo produto");
		System.out.println("[2] Listar produtos");
		System.out.println("[3] Pesquisar produto por nome");
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
		case 3:
			System.out.print("Nome do produto: ");
			String nome = sc.nextLine();
			 Produtos produtoEncontrado = null;
			for (Produtos prod : produtos) {
				if(prod.getNome().equalsIgnoreCase(nome)) {
					produtoEncontrado = prod;
					break;
				}
			}
			 if (produtoEncontrado != null) {
                 System.out.println("Produto encontrado: " + produtoEncontrado);
             } else {
                 System.out.println("Produto não encontrado.");
             }
             break;
		case 6:
			System.out.println("Saindo...");
			executando = false;
			break;
		default:
			System.out.println("Opção inválida!");
		}
		}
		sc.close();
	}
	

}
