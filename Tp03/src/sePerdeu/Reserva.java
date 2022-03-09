package sePerdeu;

public class Reserva extends Horario {
	
	//atributos
	
	public Agencia agencia;
	public Cadastro cliente;
	
	//metodos publicos
	
	public void confirmar() {
		
	}
	public void cancelar() {
		
	}
	public void editar() {
		
	}
	public void status() {
		
	}
	
	
	//metodos especiais
	
	public Reserva(Agencia agencia, Cadastro cliente) {
		this.agencia = agencia;
		this.cliente = cliente;
	}
	
	public Agencia getAgencia() {
		return agencia;
	}
	
	public Cadastro getCliente() {
		return cliente;
	}
	
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}
	

}
