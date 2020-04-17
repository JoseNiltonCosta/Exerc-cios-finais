import java.util.Scanner;

public class EversaoDeValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a, b,c;
			Scanner ler = new Scanner(System.in);
			System.out.print("digite um valor para A ");
			a = ler.nextInt();
			System.out.print("digite um valor para B ");
			b = ler.nextInt();
			c=a;
			a=b;
			b=c;
			System.out.println("O valor de A é "+ a);
			System.out.print("E o valor de b é "+ b);
	}       
	

}
