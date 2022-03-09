package sePerdeu;

public class Agencia {
	
	//atributos
	
	public Classe classes;
	public Telefone telefone;
	public String estado, cidade, endereco;
	
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
	
	public Agencia(Classe classes, Telefone telefone, String estado, String cidade, String endereco) {
		this.classes = classes;
		this.telefone = telefone;
		this.estado = estado;
		this.cidade = cidade;
		this.endereco = endereco;
	}
	
	public Classe getClasses() {
		return classes;
	}
	
	public Telefone getTelefone() {
		return telefone;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setClasses(Classe classes) {
		this.classes = classes;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
