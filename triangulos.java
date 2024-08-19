package triangulos;
import java.util.Scanner;
public class triangulos {
	public static void main (String args[]) {
		Scanner in = new Scanner (System.in);
		double a, b, c, x;
		System.out.println("Digite o valor de A:");
		a = in.nextDouble();
		System.out.println("Digite o valor de B:");
		b = in.nextDouble();
		System.out.println("Digite o valor de C:");
		c = in.nextDouble();
		if (a>b+c || b>a+c || c>b+a) {
			System.out.println("Não é um triângulo");
		} else if (a==b && b==c) {
			System.out.println("É um triângulo equilátero");
		} else if (a!=b && b!=c && a!=c) {
			System.out.println("É um triângulo escaleno");
		} else {
			System.out.println("É um triângulo isóceles");
		}
		in.close();
	}
}
