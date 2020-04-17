import java.util.Scanner;

public class ConversorDiaMesAno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dia, mes, ano, resultado;
	Scanner ler = new Scanner(System.in);
	System.out.println("digite uma quantidade de dias ");
	dia = ler.nextInt();
	mes = dia/30;
	ano = dia/365;
	System.out.println("A quantidade digitada é igual a " + ano +" anos e ");
	System.out.println("A quantidade digitada é igual a " + mes +" meses ");
	
	}

}
