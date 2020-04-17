import java.util.Scanner;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		float ir,salario;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor do seu salario");
		salario=in.nextFloat();
		
		if(salario>= 4664.68) {
			ir=(float) (salario*27.5/100-869.36);
			System.out.println("Seu imposto de renda terá o valor de "+ir+" R$");
	}else if(salario>3751.06) {
			ir=(float) (salario*22.5/100-636.13);
			System.out.println("Seu imposto de renda terá o valor de "+ir+" R$");
}else if(salario>2826.66){
	ir=(float)(salario*15/100-354.80);
	System.out.println("Seu imposto de renda terá o valor de "+ir+" R$");
}else if(salario>1903.99) {
	ir=(float)(salario*7.5/100-142.80);
	System.out.println("Seu imposto de renda terá o valor de "+ir+" R$");
}else {
	System.out.println("você está insento de imposto de renda");
}
		
}
}