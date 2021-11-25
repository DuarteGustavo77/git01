import java.util.Scanner;
public class intersecção {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		final int TAM= 5;
		int i, x=0, a[], b[], c[];
		
		a= new int[TAM];
		b= new int[TAM];
		c= new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+"o. valor de A");
			a[i]= ler.nextInt();
		}
			for(i=0; i<TAM; i++) {
				System.out.println("Entre com o "+(i+1)+"o. valor de B");
				b[i]= ler.nextInt();
			
				if(b[i]==a[i]) {
					x++;}
		}
			for(i=0; i<1; i++) {
				c[i] = x;
				System.out.println(c[i]+" valores são existentes em A e B");}
	
	
	}
		}	