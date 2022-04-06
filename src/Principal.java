import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Produto prod = new Produto();
		double valor;
		int quantidade;

		// A) CRIAR UM PRODUTO
		System.out.println("Digite o nome do produto: ");
		prod.setNome(in.nextLine());

		System.out.println("Digite o código do produto: ");
		prod.setCodigo(in.nextInt());

		System.out.println("Digite o preço de custo do produto:");
		prod.setPrecoCusto(in.nextDouble());

		System.out.println("Digite a margem de lucro do produto (porcentagem): ");
		prod.setMargemLucro(in.nextDouble());

		System.out.println("Digite a quantidade do produto: ");
		prod.setQuantidade(in.nextInt());

		// B) CALCULAR O PREÇO VENDA
		prod.calcularPrecoVenda();

		// C) REGISTRAR A ENTRADA DE 70 UNIDADES
		System.out.println("Adicionar unidades ao estoque:");
		quantidade = in.nextInt();
		prod.registrarEntrada(quantidade);
		System.out.println("Quantidade: " + prod.getQuantidade());

		// D) REGISTRAR A SAÍDA DE 40 UNIDADES
		System.out.println("\nRemover unidades do estoque:");
		quantidade = in.nextInt();
		prod.registrarSaida(quantidade);
		System.out.println("Quantidade: " + prod.getQuantidade());

		// E) EXIBIR DADOS DO PRODUTO
		prod.exibirDados();
		in.nextLine();

		// USANDO O MÉTODO: DEFINIR PREÇO DE VENDA
		System.out.println("\nDefina o valor de venda:");
		valor = in.nextDouble();
		prod.definirPrecoVenda(valor);

		// EXIBIR DADOS
		prod.exibirDados();

	}

}
