package programa;

public class Produtos {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produtos(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "[Produtos]: \n nome = " + nome +
				"/n Preço = " + preco +
				"/n Quantidade = " + quantidade;
	}
	
	

}
