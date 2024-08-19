package nascimento;
import java.util.Scanner;
public class nascimento {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		int idade, nascimento, atual;
		System.out.println("Insira o ano de nascimento da pessoa:");
		nascimento = in.nextInt();
		System.out.println("Insira o ano atual:");
		atual = in.nextInt();
		idade = atual-nascimento;
		if(idade<10) {
			System.out.println("Aqui está a idade dela" +idade+ "e é uma criança");
		} else if(idade>=10) {
			System.out.println("Aqui está a idade dela" +idade+ "e é um adolescente");
		} else if(idade>=18) {
			System.out.println("Aqui está a idade dela" +idade+ "e é um adulto");
		} else if(idade>=60) {
			System.out.println("Aqui está a idade dela" +idade+ "e é um idoso");
		}
	}
}
