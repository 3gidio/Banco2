package br.com.alura.screenMatch2;

public class Serie extends Titulo { // extends = heranca (essa classe e heranca de outra classe) (SUBCLASSE)
									// (ESPECIALIZACOES)
	private int temporadas;
	private boolean ativa;
	private int episodiosPorTemporada;
	private int minutosPorEpisodio;

	public int getTemporada() {
		return temporadas;
	}

	public void setTemporada(int temporada) {
		this.temporadas = temporada;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public int getEpisodiosPorTemporada() {
		return episodiosPorTemporada;
	}

	public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
		this.episodiosPorTemporada = episodiosPorTemporada;
	}

	public int getMinutosPorEpisodio() {
		return minutosPorEpisodio;
	}

	public void setMinutosPorEpisodio(int minutosPorEpisodio) {
		this.minutosPorEpisodio = minutosPorEpisodio;
	}

	@Override
	public int getDuracaoEmMinutos() { // Sob Escrever esse metodo (@Override)
		return temporadas * episodiosPorTemporada * minutosPorEpisodio;
	}

}
