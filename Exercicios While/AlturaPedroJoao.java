import java.util.Scanner;
public class AlturaPedroJoao {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int i=1, anos=1;
		double AltP=145, AltJ=134;
		
		while(i<=50){
			if(AltJ<AltP){
				AltJ = AltJ + 2.5;
				AltP = AltP + 2;
				i++;
				anos++;
			}else {
				System.out.println("Irá demorar "+anos+" anos para João ficar maior que pedro");
			}
		}
		
		
	}

}
