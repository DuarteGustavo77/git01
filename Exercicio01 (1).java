import javax.swing.JOptionPane;
public class Exercicio01 {

	public static void main(String[] args) {
		double valor, valorConv, DOLAR = 5.70, EURO = 5.22;
		int opcao;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o val�or que quer converter"));
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("escolha o tipo de convers�o: \n 1 - D�lar \n 2 - Euro"));
		
		if(opcao==1) {
			valorConv = valor/DOLAR;
			JOptionPane.showMessageDialog(null, "valor em real: R$ "+valor+"\n valor convertido em d�lar: $ "+valorConv);
		}else {
			valorConv = valor/EURO;
			JOptionPane.showMessageDialog(null, "valor em real: R$ "+valor+"\n valor convertido em euro: � "+valorConv);
		}

	}

}
