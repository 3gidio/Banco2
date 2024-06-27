package screenMatch;

public class Main {

	public static void main(String[] args) {
		System.out.println("Esse e o Screen Match\n");
		System.out.println("Filme: Top Gun : Maverick");
		
		int anoDeLancamneto = 2022;
		System.out.println("Ano de Lancamento " + anoDeLancamneto);
		boolean incluidoNoPlano = true;
		
		double notaDoFilme = 8.1;
		double media = (9.8 + 6.3 + 8.0) /3; //PRECEDENCIA
		System.out.println(media);
		String sinopse = """ 
						\nFilme: Top Gun
						Filme de aventura com gala dos anos 90
						Muito Bom
						Ano de Lancamento
						""" + anoDeLancamneto;
		System.out.println(sinopse);
		
		int classificacao = (int) (media/2); //CASTING
		System.out.println(classificacao + " sEstrelas");
	}

}
