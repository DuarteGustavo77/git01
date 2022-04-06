package prjClasseConta;

public class Conta {

	// ATRIBUTOS
	private int numeroConta;
	private String nomeCorrentista;
	private double saldo;

	// M�TODOS

	// GET/SET N�MERO CONTA
	public int getNumConta() {
		return this.numeroConta;
	}

	public void setNumConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	// GET/SET NOME CORRENTISTA
	public String getNomeCorrentista() {
		return this.nomeCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}

	// GET/SET SALDO
	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// M�TODO ABRE CONTA
	public void abreConta(int numeroConta, String nomeCorrentista, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
	}

	// M�TODO DEPOSITA VALOR
	public void depositaValor(double valor) {
		this.saldo = this.saldo + valor;
	}

	// M�TODO RETIRA VALOR
	public void retiraValor(double valor) {
		if (this.saldo < valor) {
			System.out.println("\nSaldo insuficiente");
		}
		this.saldo = this.saldo - valor;
	}

	// M�TODO RETIRA VALOR RETORNA SALDO
	public double retiraValorRetornaSaldo(double valor) {
		if (this.saldo < valor) {
			System.out.println("\nSaldo insuficiente");
		} else {
			this.saldo = this.saldo - valor;
			System.out.println("Saldo: " + this.saldo);
		}
		return this.saldo;
	}

	// M�TODO EXIBIR SALDO
	public void exibirSaldo() {
		if (this.saldo < 0) {
			System.out.println("\nSaldo insuficiente");
		} else {
			System.out.println("\nNumero conta: " + getNumConta());
			System.out.println("Nome correntista: " + getNomeCorrentista());
			System.out.println("Saldo: " + getSaldo());
		}
	}
}
