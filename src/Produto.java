
public class Produto {

	// ATRIBUTOS
	String nome;
	int codigo;
	int quantidade;
	double precoCusto;
	double precoVenda;
	double margemLucro;
	double valor;

	// M�TODOS

	// REGISTRAR SA�DA
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

	// CALCULAR PRE�O VENDA
	public void calcularPrecoVenda() {
		this.precoVenda = precoCusto / 100 * precoVenda;
	}

	// DEFINIR PRE�O VENDA
	public double definirPrecoVenda(double valor) {
		if (precoVenda < precoCusto) {
			System.out.println("O pre�o de venda � inferior ao custo");
		}
		return this.precoVenda;
	}

	// EXIBIR DADOS
	public void exibirDados() {

	}

}
