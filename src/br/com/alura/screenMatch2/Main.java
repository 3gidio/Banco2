package br.com.alura.screenMatch2;

public class Main {
	
	//System.out.println("Esse e o ScreenMAtch2");
			

	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		
		meuFilme.setNome("O Poderoso Chefao"); //Instacia de objeto
		meuFilme.setAnoDeLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180);
		meuFilme.setIncluidoNoPlano(true);
		
		
		meuFilme.exibeFichatecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10); 
		System.out.println("Total de Avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
		System.out.println("Media de Avaliacao: " + meuFilme.pegaMedia());
		System.out.println("\n************************************");
		
		Serie minhaSerie = new Serie();
		
		minhaSerie.setNome("Lost");
		minhaSerie.setAnoDeLancamento(2000);
		minhaSerie.exibeFichatecnica();
		minhaSerie.setTemporada(10);
		minhaSerie.setEpisodiosPorTemporada(10);
		minhaSerie.setMinutosPorEpisodio(50);
		System.out.println("Duracao para Maratonar essa Serie: " + minhaSerie.getDuracaoEmMinutos());
		
		Filme  outroFilme = new Filme();
		outroFilme.setNome("Avatar");
		outroFilme.setAnoDeLancamento(1970);
		outroFilme.setDuracaoEmMinutos(200);
		outroFilme.setIncluidoNoPlano(true);
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		System.out.println("\nO tempo Total para assistir todos esses conteudos e de " 
							+ calculadora.getTempoTotal()
							+ " minutos");
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);
		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(minhaSerie);
		episodio.setTotalVisualizacoes(300);
		filtro.filtra(episodio);
		
	}

		
}
