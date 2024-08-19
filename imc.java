package imc;
import java.util.Scanner;
	public class imc {
		public static void main(String args[]) {
			Scanner in = new Scanner (System.in);
			double peso, altura, imc;
			System.out.println("Digite o peso da pessoa:");
			peso = in.nextDouble();
			System.out.println("Digite a altura da pessoa:");
			altura = in.nextDouble();
			imc = peso/(altura*altura);
			if (imc<18.5) {
				System.out.println("A pessoa tem excesso de magreza " +imc+ " E aqui está o imc dela");
			} else if (imc<25) {
				System.out.println("A pessoa tem um peso normal " +imc+ " E aqui está o imc dela");
			} else if (imc<30) {
				System.out.println("A pessoa tem excesso de peso " +imc+ " E aqui está o imc dela");
			} else if (imc<35) {
				System.out.println("A pessoa tem Grau I de obesidade " +imc+ " E aqui está o imc dela");
			} else if (imc<40) {
				System.out.println("A pessoa tem Grau II de obesidade " +imc+ " E aqui está o imc dela");
			} else {
				System.out.println("A pessoa tem Grau III de obesidade " +imc+ " E aqui está o imc dela");
			}
			in.close();
	}
}
