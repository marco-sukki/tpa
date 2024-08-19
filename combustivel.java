package combustivel1;
import java.util.Scanner;
	public class combustivel {
		public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		double distancia, capacidade, gastomedio;
		System.out.println("Digite a distância percorrida:");
		distancia = in.nextDouble();
		System.out.println("Digite a capacidade do tanque de gasolina");
		capacidade = in.nextDouble();
		gastomedio = distancia/capacidade;
		if (gastomedio>=10) {
			System.out.println("Parabéns, seu carro é econômico!");
		} else {
			System.out.println("Que pena, seu carro não é economico");
		}
		in.close();
	}
}
