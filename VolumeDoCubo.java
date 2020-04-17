package volumeDoCubo;

import java.util.Scanner;

public class VolumeDoCubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,v;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um valor para calcular o volume do cubo");
		l=ler.nextInt();
		System.out.println();
		v=(l*l*l);
		System.out.printf("O volume do cubo é igual a" + v);
	}

}
