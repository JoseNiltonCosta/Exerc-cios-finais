package salarioDesconto2;

import java.util.Scanner;

public class SalarioDesconto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sb,sl,vt,inss;
		Scanner ler = new Scanner(System.in);
		System.out.println("digite o valor do sal�rio bruto");
		sb=ler.nextFloat();
		inss=(sb/100*8);
		vt=(sb/100*6);
		sl=(sb-vt-inss);
		System.out.println("Seu sal�rio liquido ser� de "+ sl +"Reais");
	}

}
