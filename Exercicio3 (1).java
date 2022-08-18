import javax.swing.JOptionPane;
public class Exercicio3 {

	public static void main(String[] args) {
		
		String nome;
		int salario, novoSalario, reajuste ;
		
		nome = JOptionPane.showInputDialog(null, "Insira seu nome: ", "Nome", JOptionPane.INFORMATION_MESSAGE);
		salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira seu salário", "Salário", JOptionPane.INFORMATION_MESSAGE));
		
		reajuste = salario/10;
		novoSalario = salario+reajuste;
		
		JOptionPane.showMessageDialog(null, "Nome: "+nome+"\n"+"Salário: "+salario+"\n"+"Percentual de reajuste: 10%\n"+"Valor do reajuste: "+reajuste+"\n"+"Salario com reajuste: "+novoSalario, "Dados", JOptionPane.PLAIN_MESSAGE);
		
	}

}
