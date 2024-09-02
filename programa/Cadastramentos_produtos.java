package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastramentos_produtos {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		List<Produtos> produtos = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- Cadastramento ---");
		System.out.println("[1] Adicionar novo produto");
		System.out.println("[2] Listar produtos");
		System.out.println("[3] Pesquisar produto por nome");
		System.out.println("[4] Editar informações do produto");
		System.out.println("[5] Deletar um produto");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			
		}
		sc.close();
	}
	

}
