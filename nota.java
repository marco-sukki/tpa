package nota;
import java.util.Scanner;
public class nota {
	public static void main(String args[]) {
		Scanner dinossauro = new Scanner(System.in);
		double nota1, nota2, media, exame;
		System.out.println("Digite qual foi a primeira nota");
		nota1 = dinossauro.nextDouble();
		System.out.println("Digite qual foi a segunda nota");
		nota2 = dinossauro.nextDouble();
		media = (nota1+nota2)/2;
		if (media<3) {
			System.out.println("Aqui está sua média: " +media+ " e você está reprovado.");
		} else if (media<6 & media>=3){
			System.out.println("Aqui está sua média: " +media+ " e você precisa de um novo exame, digite aqui qual foi sua nota no exame:");
			exame = dinossauro.nextDouble();
			if (exame>=6) {  
				System.out.println("Você passou com o exame!");
			} else {
				System.out.println("Mesmo com o exame, você reprovou.");
			}
		} else  {
			System.out.println("Aqui está sua média" +media+ "e você está aprovado!");
		}
		dinossauro.close();
	}
}
