package lista1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		float preco, desconto, parcelas, ajuste;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor total do produto ");
		preco=in.nextFloat();
		System.out.println("Digite o valor da porcentagem do desconto a ser dado a pagamento a vista");
		desconto=in.nextFloat();
		System.out.println("digite em quantas vezes ser� o pagamento");
		parcelas=in.nextFloat();
		if(parcelas<=1) {
			ajuste=preco-(preco/100*desconto);
			System.out.println("pagamento a vista recebe desconto de 4%, ent�o o valor sera de "+ ajuste+"R$");
		}else {
			System.out.println("O pagamento n�o � a vista, o valor � integral de "+preco+"R$");
			
		}
	}

}
