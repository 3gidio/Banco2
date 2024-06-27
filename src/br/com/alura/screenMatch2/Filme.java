package br.com.alura.screenMatch2; /*nome de dominio reverso (quando colocamos o site de forma invertida seguido 
                                     do nome do pacote*/

public class Filme extends Titulo  implements Classificavel { // extends Titulo = Heranca (SUBCLASSE)(ESPECIALIZACOES)
	private String diretor;

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		return (int) pegaMedia() / 2;
	}
	
	
}
