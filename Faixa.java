import java.util.Scanner;


public class Faixa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		int idade;
		int faixa1 =0;
		int faixa2 =0;
		int faixa3 =0;
		int faixa4 =0;
		int faixa5 =0;
		float porcentagem =0;
		Scanner in = new Scanner(System.in);
		while(i<=15){
			
			System.out.println("digite a idade");
			idade=in.nextInt();
			
		if(idade<16){
			System.out.println("voce pertence a faixa etaria 1");
			faixa1++;
		}
		else if(idade <31){
			System.out.println("voce pertence a faixa etaria 2");
			faixa2++;
		}
		else if(idade <46){
			System.out.println("voce pertence a faixa etaria 3");
			faixa3++;
		}
		
		else if(idade <61){
			System.out.println("voce pertence a faixa etaria 4");
			faixa4++;
		}else {
			System.out.println("voce pertence a faixa etaria 5");
			faixa5++;
			
		}
		
			i++;
			
			
		}
		porcentagem=(15/100*faixa1);
	
		
		System.out.println(faixa1+"  pessoa pertence a faixa1");
		System.out.println(faixa2+"  pessoa pertence a faixa2");
		System.out.println(faixa3+  "pessoa pertence a faixa3");
		System.out.println(faixa4+"  pessoapertence a faixa4");
		System.out.println(faixa5+"  pessoapertence a faixa5");
		System.out.print(porcentagem);

	}

}
