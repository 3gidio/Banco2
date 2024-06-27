package bancoDigital;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("******************************************\n" + 
						"$$$ EGIDIO BANK $$$\n");
		Scanner dados = new Scanner(System.in);
		System.out.println("Digite o nome do cliente:");
		String nome = dados.nextLine();
		System.out.println("Tipo de Conta:");
		String tipoDeConta = dados.nextLine();
		System.out.println("Digite o saldo inicial:");
		Double saldo = dados.nextDouble();
		int opcao = 0;
		
		System.out.println("******************************************\n" + "$$$ EGIDIO BANK $$$\n" + "\nDados do Cliente:" + 
		"\n\nNome Cliente: " + nome + "\nTipo de Conta: " 
		+ tipoDeConta + "\nSaldo Atual:  R$ " + saldo + "\n\n******************************************\n" );
		
	
		

	}
		
}
