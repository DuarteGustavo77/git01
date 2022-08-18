import javax.swing.JOptionPane;
public class Exercicio01 {

	public static void main(String[] args) {
		double valor, valorConv, DOLAR = 5.70, EURO = 5.22;
		int opcao;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valçor que quer converter"));
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("escolha o tipo de conversão: \n 1 - Dólar \n 2 - Euro"));
		
		if(opcao==1) {
			valorConv = valor/DOLAR;
			JOptionPane.showMessageDialog(null, "valor em real: R$ "+valor+"\n valor convertido em dólar: $ "+valorConv);
		}else {
			valorConv = valor/EURO;
			JOptionPane.showMessageDialog(null, "valor em real: R$ "+valor+"\n valor convertido em euro: € "+valorConv);
		}

	}

}
