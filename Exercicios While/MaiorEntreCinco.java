import java.util.Scanner;
public class MaiorEntreCinco {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int i=1, n1, n2, n3, n4, n5;
		do {
		System.out.println("Digite o primeiro numero: ");
		n1 = ler.nextInt();
		System.out.println("Digite o segundo numero");
		n2 = ler.nextInt();
		
		System.out.println("Digite o terceiro numero");
		n3 = ler.nextInt();
		
		System.out.println("Digite o quarto numero");
		n4 = ler.nextInt();
		
		System.out.println("Digite o quinto numero");
		n5 = ler.nextInt();
		
		if(n1>n2 & n1>n3 & n1>4 & n1>n5) {System.out.println(n1+" é o maior numero");}
		else if(n2>n1 & n2>n3 & n2>n4 & n2>n5) {System.out.println(n2+" é o maior numero");}
		else if(n3>n5 & n3>n4 & n3>n2 & n3>n1) {System.out.println(n3+" é o maior numero");}
		else if(n4>n5 & n4>n3 & n4>n2 & n4>n1) {System.out.println(n4+" é o maior numero");}
		else if(n5>n4 & n5>n3 & n5>n2 & n5>n1) {System.out.println(n5+" é o maior numero");}
		
		i++;
		}while(n1!=0 & n2!=0 & n3!=0 & n4!=0 & n5!=0);
		System.out.println("O programa acabou.");
	}
}
