package tabela;
import java.util.Scanner;
public class tabela {
	public static void main(String args[]) {
		Scanner dinossauro = new Scanner(System.in);
		double salário, aliquota, parcela, irpf;
		System.out.println("Digite aqui qual o salário:");
		salário = dinossauro.nextDouble();
		if (salário<=1434.59) {
			System.out.println("Você não tem IRPF");
		} else if (salário<=2150) {
			aliquota = 7.5;
			parcela = 107.59;
			irpf = salário*aliquota/100-parcela;
			System.out.println("Você tem "+irpf+" de desconto do IRPF");
		} else if (salário<=2866.70) {
			aliquota = 15;
			parcela = 268.84;
			irpf = salário*aliquota/100-parcela;
			System.out.println("Você tem "+irpf+" de desconto do IRPF");
		} else if (salário<=3582) {
			aliquota = 22.5;
			parcela = 483.84;
			irpf = salário*aliquota/100-parcela;
			System.out.println("Você tem "+irpf+" de desconto do IRPF");
		} else {
			aliquota = 27.5;
			parcela = 662.94;
			irpf = salário*aliquota/100-parcela;
			System.out.println("Você tem "+irpf+" de desconto do IRPF");
		}
		dinossauro.close();
	}
}
