package agenda_contatos;

public class Contato {
	
	private String nome;
	private String telefone;
	private String email;
	
	public Contato() {
	}
	
	public Contato(String nome, String telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contato \n Nome: " + nome + "\n Telefone: " + telefone +
				"\n Email: " + email + "\n";
	}

}
