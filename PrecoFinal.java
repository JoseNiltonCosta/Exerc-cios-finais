package precoFinal;

import java.util.Scanner;

public class PrecoFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pp, qtd, pv, lu;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor do produto");
		pp=ler.nextFloat();
		System.out.println("quantidade vendida");
		qtd=ler.nextFloat();
		System.out.println("digite o preço que foi vendido");
		pv=ler.nextFloat();
		lu=(pv-pp)*qtd;
		System.out.println("O lucro das vendas foi de "+ lu +"R$");
		
	}

}
