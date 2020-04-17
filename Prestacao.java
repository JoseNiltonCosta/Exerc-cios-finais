package prestacao;
import java.util.Scanner;
public class Prestacao {

	public static void main(String[] args) {
	
		double prestacao,dias,juros;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor da prestação");
		prestacao=in.nextDouble();
		System.out.println("digite a quantidade de dias em atrazo");
		dias=in.nextDouble();
		prestacao=prestacao + (prestacao/100*2);
		juros= dias*0.01/100;
		if(dias > 45) {
			prestacao=prestacao+(prestacao*3/100)+ juros;
		}else {
			prestacao=prestacao+juros;
		}
		System.out.println("a prestacão será de "+ prestacao+" R$");
	}

}
