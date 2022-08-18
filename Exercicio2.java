import javax.swing.JOptionPane;
public class Exercicio2 {
	
	public static void main(String[]args) {
		int i;
		int n = Integer.parseInt(JOptionPane.showInputDialog(null,  "insira o numero da tabuada", "Tabuada", JOptionPane.QUESTION_MESSAGE));
		
		for(i=0; i<=10; i++) {
			JOptionPane.showMessageDialog(null,n+" x "+i+" = " +(n*i), "Tabuada", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
