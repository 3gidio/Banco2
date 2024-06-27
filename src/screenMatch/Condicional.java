package screenMatch;

public class Condicional {

	public static void main(String[] args) {
		int anoDeLancamneto = 2022;
		boolean incluidoNoPlano = true;
		double notaDoFilme = 8.1;
		String tipoPlano = "Plus";
		
		if (anoDeLancamneto >= 2022) {
			System.out.println("Lancamento que os Clientes estao Gostando");
		} else {
			System.out.println("Filme Retro que vale a pena assistir");
		}
		if (incluidoNoPlano == true || tipoPlano.equals("Plus")) {
			System.out.println("Filme liberado para Cliente Plus ");
		} else {
			System.out.println("Filme nao Liberado,"
					+ " Assine nosso Plano Plus e tenha acesso Liberado");
		}
		
		
	}

}
