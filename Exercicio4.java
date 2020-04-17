package lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		float valor, ipva;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor do carro ");
		valor=in.nextFloat();
		ipva=(valor*100/4);
		System.out.println("O valor do IPVA do carro será de "+ ipva+" Reais");
		
	}

}
