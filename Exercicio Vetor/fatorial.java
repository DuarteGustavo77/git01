import java.util.Scanner;
public class fatorial {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		final int TAM= 15;
		int i, x, a[], b[], fato=1;
		
		a= new int[TAM];
		b= new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Escreva o" +(i+1)+"o numero");
			a[i]= ler.nextInt();
		   
			
		for(x=1; x<=a[i]; x++)  
			
			fato= fato*x;
		b[i]=fato;
			    System.out.println("Fatorial é "+b[i]);
			fato=1;  
			}
			
		}
		
		
	}

