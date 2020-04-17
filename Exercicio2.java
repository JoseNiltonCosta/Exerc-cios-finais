package lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int num, antecessor, sucessor;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		num=in.nextInt();
		
		antecessor=num-1;
		sucessor=num+1;
		
		System.out.println("O numero antecessor ao digitado é "+ antecessor);
		System.out.println("O numero sucessor ao digitado é "+ sucessor);
	}

}
