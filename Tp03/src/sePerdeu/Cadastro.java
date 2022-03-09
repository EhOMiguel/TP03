package sePerdeu;

public class Cadastro {
	
	//atributos
	
	public Telefone telefone;
	public String cpf, nome, email;
	
	//metodos publicos

	public void cadastrar() {
		
	}
	public void editar() {
		
	}
	public void deletar() {
		
	}
	public void status() {
		
	}
	
	//metodos especiais
	
	public Cadastro(Telefone telefone, String cpf, String nome, String email) {
		this.telefone = telefone;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}
	
	public Telefone getTelefone() {
		return telefone;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

	
}
