public class Produto {

	// ATRIBUTOS
	private String nome;
	private int codigo;
	private int quantidade;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;

	// M�TODOS

	// GET/SET NOME
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// GET/SET CODIGO
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	// GET/SET QUANTIDADE
	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	// GET/SET PRE�O CUSTO
	public double getPrecoCusto() {
		return this.precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	// GET/SET PRE�O VENDA
	public double getPrecoVenda() {
		return this.precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	// GET/SET MARGEM LUCRO
	public double getMargemLucro() {
		return this.margemLucro;
	}

	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}

	// REGISTRAR SA�DA
	public int registrarSaida(int quantidade) {
		this.quantidade = this.quantidade - quantidade;

		if (this.quantidade < quantidade) {
			System.out.println("\nEstoque indispon�vel");
		}
		return this.quantidade;
	}

	// REGISTAR ENTRADA
	public int registrarEntrada(int quantidade) {
		this.quantidade = this.quantidade + quantidade;

		return this.quantidade;

	}

	// CALCULAR PRE�O VENDA
	public void calcularPrecoVenda() {
		this.precoVenda = margemLucro / 100;
		this.precoVenda = this.precoVenda + 1;
		this.precoVenda = this.precoVenda * precoCusto;
	}

	// DEFINIR PRE�O VENDA
	public double definirPrecoVenda(double valor) {
		if (precoVenda < precoCusto) {
			System.out.println("O pre�o de venda � inferior ao custo!");
		}
		this.precoVenda = valor;
		this.margemLucro = this.precoVenda - this.precoCusto;
		this.margemLucro = this.margemLucro / this.precoCusto;
		this.margemLucro = this.margemLucro * 100;

		return this.margemLucro;
	}

	// EXIBIR DADOS
	public void exibirDados() {
		this.definirPrecoVenda(precoVenda);
		System.out.println("\nNome: " + this.nome);
		System.out.println("C�digo: " + this.codigo);
		System.out.println("Pre�o custo: " + this.precoCusto);
		System.out.println("Margem Lucro: " + this.margemLucro);
		System.out.println("Pre�o de venda: " + this.precoVenda);
		System.out.println("Quantidade " + this.quantidade);
	}

}
