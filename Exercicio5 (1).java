import javax.swing.JOptionPane;
public class Exercicio5 {

	public static void main(String[] args) {
		int combustivel;
		double km, consumo, alcool=3.50, gasolina=5;
		
		combustivel = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das op��es abaixo: \n1 - �lcool \n2 - Gasolina", "Dados do combust�vel", JOptionPane.QUESTION_MESSAGE ));
		
		km = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quilometragem: "));
		
		if(combustivel == 1) {
			consumo = alcool/km;
			JOptionPane.showMessageDialog(null,"Consumo do ve�culos: "+consumo+"\n gasto do �lcool: "+alcool, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		}else {
			consumo = gasolina/km; 
			JOptionPane.showMessageDialog(null,"Consumo do ve�culos: "+consumo+"\n gasto da Gasolina: "+gasolina, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		}

	}
}
