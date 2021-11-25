import java.util.Scanner;
public class Fatorial {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int i=1, ni;
		long fato=1;
		
		System.out.println("Digite um numero");
		ni = ler.nextInt();
		
		while(i<=ni) {
			fato = fato*i;
			i++;
					} 
		System.out.println("Fatorial de "+ni+" é "+fato);
	
	}

}
