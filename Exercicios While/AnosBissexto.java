import java.util.Scanner;
public class AnosBissexto {
	public static void main(String[]args) {
		Scanner ler= new Scanner(System.in);
		int i=1, ai, af, ab=0;
	 
		System.out.println("Informe o ano inicial: ");
		ai = ler.nextInt();
		System.out.println("Informe o ano final: ");
		af = ler.nextInt();

		do{
			if (ai%4 == 0 & ai%100 !=0) {ab++;
		System.out.println(+ai);}
		
		ai++; i++;
	}while(af>=ai);
		System.out.println("Entre os anos informador " +ab+ " são bissextos");
		

}
}