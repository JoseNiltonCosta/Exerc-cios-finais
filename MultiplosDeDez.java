public class MultiplosDeDez {

	public static void main(String[] args) {
		int multiplo,cont=1;
		
		/*for(cont=1;cont<100;cont++) {
			multiplo=cont%10;
			if(multiplo==0) {
				System.out.println(cont+" É um numero multiplo de Dez");
			}*/
		do {
			multiplo=cont % 10;
			if(multiplo == 0) {
				System.out.println(cont+" É um numero multiplo de Dez");
			}cont++;
			}while(cont<100);
		}

	}



