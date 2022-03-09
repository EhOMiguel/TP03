package sePerdeu;

import java.util.Date;

public abstract class Horario {
	
	//atributos
	
	public Date dataRetirada, dataDevolucao;
	public double horaRetirada, horaDevolucao;
	
	//metodos publicos
	
	public void confirmar() {
		
	}
	public void cnacelar() {
		
	}
	
	
	//metodos especiais
	
	public Date getDataRetirada() {
		return dataRetirada;
	}
	
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	
	public double getHoraRetirada() {
		return horaRetirada;
	}
	
	public double getHoraDevolucao() {
		return horaDevolucao;
	}

	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public void setHoraRetirada(double horaRetirada) {
		this.horaRetirada = horaRetirada;
	}

	public void setHoraDevolucao(double horaDevolucao) {
		this.horaDevolucao = horaDevolucao;
	}
	
	
	
}
