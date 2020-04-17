package lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		float metros,kilometros;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("digite um valor para metros");
		metros=in.nextFloat();
		kilometros=metros/1000;
		
		if(kilometros>1) {
		System.out.println( kilometros  +" kilometros");
		}else {
			System.out.println(kilometros +" kilometro");
		}

	}

}
