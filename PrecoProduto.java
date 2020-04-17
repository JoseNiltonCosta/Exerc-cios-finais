import java.util.Scanner;

public class PrecoProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float custo, venda, lucro;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor de custo do produto ");
		custo=ler.nextFloat();
		System.out.println("Digite o valor de venda do produto  ");
		venda=ler.nextFloat();
		lucro=(venda-custo);
		System.out.println("O lucro do produto foi de "+ lucro+" reais");


	}

}
