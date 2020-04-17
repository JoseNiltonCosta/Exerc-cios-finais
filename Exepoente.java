import java.util.Scanner;

public class Exepoente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int base;
		
		int expoente;
		
		int potencia;
		System.out.println("digite a base");
		base=in.nextInt();
		
		System.out.println("digite a  expoente");
		 expoente=in.nextInt();
		
	
	 potencia = (int) Math.pow (base , expoente);
		 
		 System.out.println("o valor da potencia   "+"   "+potencia);

	}

}
