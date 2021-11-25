import java.util.Scanner;
public class LacoWhile {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int i=1, aa, an, id, maior=0, menor=0, somaIdade=0;
		while (i<=10) {
			
			System.out.println("Entre com ano atual");
			aa = ler.nextInt();
			
			System.out.println("Entre com o ano do nascimento");
			an = ler.nextInt();
			
			id = aa-an;
			
			
			if(id<18) {
				
				menor++;
			}else {
				
				maior++;
			}
			somaIdade = somaIdade+id;
			i++;
			
		}
		System.out.println(+maior+" alunos são maiores de idade");
		System.out.println(+menor+" alunos são menores de idade");
		
		
	}
}
