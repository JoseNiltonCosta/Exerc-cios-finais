package lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int num1, num2, num3, soma;
		
		Scanner in = new Scanner(System.in);
		System.out.println("digite o primeiro numero");
		num1=in.nextInt();
		
		System.out.println("Digite o segundo numero");
		num2=in.nextInt();
		
		System.out.println("Digite o terceiro numero");
		num3=in.nextInt();
		
		soma=(num1*num1)+(num2*num2)+(num3*num3);
		
		System.out.println("O resultado da soma dos tres numeros a o quadrado é "+soma);
	}

}
