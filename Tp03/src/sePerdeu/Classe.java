package sePerdeu;

public class Classe {
	
	//atributos
	
	public Carro carros;
	public String nome;
	public double valorDiaria;
	
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
	
	public Carro getCarros() {
		return carros;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setCarros(Carro carros) {
		this.carros = carros;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

}
