package br.com.alura.screenMatch2;

public class CalculadoraDeTempo {
	private int tempoTotal = 0;

	public int getTempoTotal() {
		return this.tempoTotal;
	}
	
	public void inclui(Titulo titulo) { //POLIMORFISMO
		this.tempoTotal += titulo.getDuracaoEmMinutos();
	}
}
