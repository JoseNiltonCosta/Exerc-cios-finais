import java.util.Scanner;

public class Fator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		
		
		double num;
		
		double i = 0;
		
		System.out.println("digite o numero");
		num=in.nextDouble();
		
		i= num-1;
		
		while(i>0){
			num = (num * i);
			i--;
		}
		
		
		System.out.println("O fatorial é "+ num);
		

	}

}

