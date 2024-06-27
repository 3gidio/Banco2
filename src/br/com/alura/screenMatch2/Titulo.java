package br.com.alura.screenMatch2;

public class Titulo { // (SUPER-CLASSE)(CLASSE MAE)(GENERALIZACAO)
	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes; // Private = Modificadores de Visibilidade ou modificadores de Acesso
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;

	public int getTotalDeAvaliacoes() { // metodo get
		return totalDeAvaliacoes;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public void exibeFichatecnica() {
		System.out.println("Nome do Filme: " + nome);
		System.out.println("Ano de Lancamento: " + anoDeLancamento);
		System.out.println("Duracao : " + duracaoEmMinutos + " Minutos");
		System.out.println("Esse Filme e incluido no Plano? " + incluidoNoPlano);
		// System.out.println("Avaliacao do filme: " + somaDasAvaliacoes);
		// System.out.println("Quantos usuarios avaliaram esse filme: ");

	}

	public void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}

	public double pegaMedia() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

}
