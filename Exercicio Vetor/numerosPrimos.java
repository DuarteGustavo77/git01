import java.util.Scanner;
public class numerosPrimos {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		final int TAM= 10;
		int i, a[];
		
		a= new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Escreva o" +(i+1)+"o numero");
			a[i]= ler.nextInt();
			if(a[i] % 2 ==0) {
				System.out.println("esse numero n�o � primo");
			}else {System.out.println("esse numero � primo");}
		}
		
	}
}
