package prjClasseConta;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Conta conta1 = new Conta();
		double valor;
		int numConta;

		// 1) MÉTODO ABRE CONTA

		System.out.println("Digite o nome do correntista:");
		conta1.setNomeCorrentista(in.nextLine());

		System.out.println("Digite o número da conta:");
		conta1.setNumConta(in.nextInt());

		System.out.println("Digite o saldo da conta:");
		conta1.setSaldo(in.nextDouble());

		// 2) MÉTODO DEPOSITA VALOR
		System.out.println("Digite o valor do depósito: ");
		valor = in.nextDouble();
		conta1.depositaValor(valor);
		System.out.println("Saldo: " + conta1.getSaldo());

		// 3) MÉTODO RETIRA VALOR
		System.out.println("\nDigite o valor do saque: ");
		valor = in.nextDouble();
		conta1.retiraValor(valor);
		System.out.println("Saldo " + conta1.getSaldo());

		// 5) MÉTODO EXIBIR SALDO
		System.out.println("\nDados da conta:");
		conta1.exibirSaldo();

		// 4) MÉTODO RETIRA VALOR RETORNA SALDO
		System.out.println("\nMétodo retira valor retorna saldo");
		System.out.println("\nDigite o valor do saque: ");
		valor = in.nextDouble();
		conta1.retiraValorRetornaSaldo(valor);

	}

}
