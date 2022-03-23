
public class Produto {

	// ATRIBUTOS
	String nome;
	int codigo;
	int quantidade;
	double precoCusto;
	double precoVenda;
	double margemLucro;
	double valor;

	// MÉTODOS

	// REGISTRAR SAÍDA
	public int registrarSaida(int quantidade) {
		this.quantidade = this.quantidade - quantidade;

		if (this.quantidade < quantidade) {
			System.out.println("Estoque indisponivel");
		} else {
			System.out.println("Quantidade atualizada");
		}
		return this.quantidade;
	}

	// REGISTAR ENTRADA
	public int registrarEntrada(int quantidade) {
		this.quantidade = this.quantidade + quantidade;

		System.out.println("Quantidade atualizada");
		return this.quantidade;

	}

	// CALCULAR PREÇO VENDA
	public void calcularPrecoVenda() {
		this.precoVenda = precoCusto / 100 * precoVenda;
	}

	// DEFINIR PREÇO VENDA
	public double definirPrecoVenda(double valor) {
		if (precoVenda < precoCusto) {
			System.out.println("O preço de venda é inferior ao custo");
		}
		return this.precoVenda;
	}

	// EXIBIR DADOS
	public void exibirDados() {

	}

}
