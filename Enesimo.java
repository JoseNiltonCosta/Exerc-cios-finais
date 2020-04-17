

import java.util.Scanner;

public class Enesimo {

	public static void main(String[] args) {
		// 1+1=2+1=3+2=5+3=8
		
		Scanner in = new Scanner(System.in);

		

	 int num;
	 
	 int numero = 1;
	 
	 int san = 0;
	 
	 int aux;
	 
	 System.out.println("digite o numero para inicial a sequencia Fibonacci");
	 num= in.nextInt();
	 
	 for(int i = 0; i<num; i++){
		 aux = numero;
		 
		 numero = numero+san;
		 
		 san= aux;
		 
		 System.out.println("!"+numero);
		 
	 }
	
}
}

