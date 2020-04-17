package calculeImc;

import java.util.Scanner;

public class CalculeImc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float peso, altura, imc;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o seu peso");
			peso = ler.nextFloat();
		System.out.println("Digite o sua altura");
			altura = ler.nextFloat();
		imc=peso/(altura*altura);
		System.out.printf("Seu indice de massa corporal é de %.2fn ", imc);
		if (imc >=  40) {
			
			System.out.println("voce está obeso");
		} else {
			System.out.println("voce não está obeso");
		}
		
        
	} 
}