import javax.swing.JOptionPane;
public class Exercicio5 {

	public static void main(String[] args) {
		int combustivel;
		double km, consumo, alcool=3.50, gasolina=5;
		
		combustivel = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opções abaixo: \n1 - Álcool \n2 - Gasolina", "Dados do combustível", JOptionPane.QUESTION_MESSAGE ));
		
		km = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quilometragem: "));
		
		if(combustivel == 1) {
			consumo = alcool/km;
			JOptionPane.showMessageDialog(null,"Consumo do veículos: "+consumo+"\n gasto do Álcool: "+alcool, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		}else {
			consumo = gasolina/km; 
			JOptionPane.showMessageDialog(null,"Consumo do veículos: "+consumo+"\n gasto da Gasolina: "+gasolina, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		}

	}
}
