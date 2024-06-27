package screenMatch;
import java.util.Scanner;
public class Leitura {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite seu Filme Favorito");
		String filme = leitura.nextLine();
		System.out.println("Qual o ano de Lancamento");
		int anoDeLancamento = leitura.nextInt();
		System.out.println("Diga sua avaliacao para o filme ");
		double avalicao = leitura.nextDouble();
		
		S:System.out.println("\n\n");
		System.out.println(filme);
		System.out.println(anoDeLancamento);
		System.out.println(avalicao);
	}

}
