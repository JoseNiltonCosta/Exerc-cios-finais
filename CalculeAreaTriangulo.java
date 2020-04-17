import java.util.Scanner;

public class CalculeAreaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base ;
		int altura;
		int area;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("digite o valor da base");
		base = ler.nextInt();
		
		System.out.println("digite o valor da altura");
		altura = ler.nextInt();
		
		area=base*altura/2;
		
		System.out.print("a area do triangulo retangulo é igual a "+area);

	}

}
