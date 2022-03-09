package sePerdeu;

public class Carro {
	
	//atributos
	
	public String marca, nome, foto, placa;
	public int capacidade, numeroPortas, ano;
	public Classe classe;
	public Funcao funcoes;
	
	//metodos publicos
	
	public void cadastrar() {
		
	}
	public void deletar() {
		
	}
	public void status() {
		
	}
	
	
	//metodos especiais
	
	public Carro(String marca, String nome, String foto, String placa, int capacidade, int numeroPortas, int ano,
			Classe classe, Funcao funcoes) {
		super();
		this.marca = marca;
		this.nome = nome;
		this.foto = foto;
		this.placa = placa;
		this.capacidade = capacidade;
		this.numeroPortas = numeroPortas;
		this.ano = ano;
		this.classe = classe;
		this.funcoes = funcoes;
	}
	
	public Classe getClasse() {
		return classe;
	}
	
	public Funcao getFuncoes() {
		return funcoes;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public int getNumeroPortas() {
		return numeroPortas;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public void setFuncoes(Funcao funcoes) {
		this.funcoes = funcoes;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}

}
