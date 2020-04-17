package lista1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		float emprestimo, taxa, total,parcela;
		int meses;
		Scanner in = new Scanner(System.in);
		System.out.println("digite o valor do emprestimo");
		emprestimo=in.nextFloat();
		
		System.out.println("digite em quantas parcelas será o pagamento");
		meses=in.nextInt();
		
		
		taxa=(float) ((float) emprestimo/100*2.5);
		parcela=taxa*meses;
		total=(float) emprestimo+parcela;
		
		System.out.println("O valor de cada parcela será de "+ parcela+"R$");
		System.out.println("E o total do valor será de "+ total +"R$");
	}

}
