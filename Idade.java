import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		int anoA, anoN, idade,num;
		int i =0;
		
		do {
			System.out.println("digite o ano de nascimento");
			anoN=in.nextInt();
			
			System.out.println("digite o ano Atual");
			anoA=in.nextInt();
			
			idade = anoA-anoN;
			
			System.out.println("sua idade é: "+idade);
			
			System.out.println("digite 1 para continua 0 para parar");
			num=in.nextInt();
			if(num==1) {
				
				do {	
				
				System.out.println("digite o ano de nascimento");
				anoN=in.nextInt();
				
				System.out.println("digite o ano Atual");
				anoA=in.nextInt();
				
				idade = anoA-anoN;
				
				System.out.println("sua idade é: "+idade);
				
				System.out.println("digite 1 para continua 0 para parar");
				num=in.nextInt();
				 if (num==0) {
					
					System.out.println("fim da operação");
				}
				
				
				
				}while(num>0);
				
			}else if (num==0) {
				
				System.out.println("fim da operação");
			}
			
			
			
		}while(num>0);
		
		
		
		/*System.out.println("digite 1 para continua ou 0 para parar");
		num=in.nextInt();
		
		if(num==1) {
			do {
				System.out.println("digite o ano de nascimento");
				anoN=in.nextInt();
				
				System.out.println("digite o ano Atual");
				anoA=in.nextInt();
				
				idade = anoA-anoN;
				
				System.out.println("sua idade é: "+idade);
				
				
			}while(anoN>0 || anoA > 0 );
			
			
		}else if (num==0){
			System.out.println("fim da operação");
			
		}*/
		
	
		
	}

}
