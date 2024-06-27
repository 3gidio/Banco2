package br.com.alura.screenMatch2;

public class FiltroRecomendacao {
	
	public void filtra(Classificavel classificavel) {
		if (classificavel.getClassificacao() >= 4) {
			System.out.println("\nEsta entre os preferidos do Momento");
		} else if (classificavel.getClassificacao() >= 2) {
			System.out.println("\nMuito bem avaliado no Momento");
		} else {
			System.out.println("\ncoloque na sua Lista para Assistir Depois");
		}
	}
}
