import java.util.Scanner;
public class paresImpares {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		final int TAM= 20;
		int i, a[], b[], par=0, impar=0;
		
		a = new int[TAM];
		b = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor");
			a[i]= ler.nextInt();
		}
		for (i=0; i<TAM; i++) {
			if(a[i] % 2 == 0){
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.println(par+" são par");
		System.out.println(impar+" são impar");
		
	}
}
