import java.util.Scanner;
public class tabuadaVetor {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		final int TAM= 5;
		int i, a[], div=1, r;
		
		a = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor");
			a[i]= ler.nextInt();
			r = a[i] * div; 
			System.out.println(a[i]+ "X" +div+ "=" +r);
			div++;
			r = a[i] * div; 
			System.out.println(a[i]+ "X" +div+ "=" +r);
			div++;
			r = a[i] * div; 
			System.out.println(a[i]+ "X" +div+ "=" +r);
			div++;
			r = a[i] * div; 
			System.out.println(a[i]+ "X" +div+ "=" +r);
			div++;
			r = a[i] * div; 
			System.out.println(a[i]+ "X" +div+ "=" +r);
			div++;
			r = a[i] * div; 
			System.out.println(a[i]+ "X" +div+ "=" +r);
			div++;
			r = a[i] * div; 
			System.out.println(a[i]+ "X" +div+ "=" +r);
			div++;
			r = a[i] * div; 
			System.out.println(a[i]+ "X" +div+ "=" +r);
			div++;
			r = a[i] * div; 
			System.out.println(a[i]+ "X" +div+ "=" +r);
			div++;
			r = a[i] * div; 
			System.out.println(a[i]+ "X" +div+ "=" +r);
			div++;
			
			div=1;
		} 
		
		
		
	}
}
