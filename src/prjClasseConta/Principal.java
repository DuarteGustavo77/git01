package prjClasseConta;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Conta conta1 = new Conta();
		double valor;
		int numConta;

		// 1) M�TODO ABRE CONTA

		System.out.println("Digite o nome do correntista:");
		conta1.setNomeCorrentista(in.nextLine());

		System.out.println("Digite o n�mero da conta:");
		conta1.setNumConta(in.nextInt());

		System.out.println("Digite o saldo da conta:");
		conta1.setSaldo(in.nextDouble());

		// 2) M�TODO DEPOSITA VALOR
		System.out.println("Digite o valor do dep�sito: ");
		valor = in.nextDouble();
		conta1.depositaValor(valor);
		System.out.println("Saldo: " + conta1.getSaldo());

		// 3) M�TODO RETIRA VALOR
		System.out.println("\nDigite o valor do saque: ");
		valor = in.nextDouble();
		conta1.retiraValor(valor);
		System.out.println("Saldo " + conta1.getSaldo());

		// 5) M�TODO EXIBIR SALDO
		System.out.println("\nDados da conta:");
		conta1.exibirSaldo();

		// 4) M�TODO RETIRA VALOR RETORNA SALDO
		System.out.println("\nM�todo retira valor retorna saldo");
		System.out.println("\nDigite o valor do saque: ");
		valor = in.nextDouble();
		conta1.retiraValorRetornaSaldo(valor);

	}

}
