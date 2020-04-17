import java.util.Scanner;

public class CalculeIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nasc, aatual,idade;
		
		Scanner ler = new Scanner(System.in);
		
		 System.out.println("digite o seu ano de nascimento ");
		 nasc = ler.nextInt();
		 
		 System.out.println("digite o ano atual  ");
		 aatual = ler.nextInt();
		 
		 idade=aatual-nasc;
		 
		 System.out.println("sua idade é "+idade+" anos");
		 

	}

}
