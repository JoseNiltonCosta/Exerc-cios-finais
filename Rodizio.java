import java.util.Scanner;

public class Rodizio {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

	int placa, i, dia;
	
	System.out.println("digite o dia da semana em numeral, sendo 1 equvalente a domingo e 7 equivalente a sabado");
	dia=in.nextInt();
	
	System.out.println("digite os dois ultimos numeros da placa do seu carro usando a tecla espaço para separa-los");
	placa=in.nextInt();
	
	switch(dia){
			
		case 2:
			if(placa==1 || placa==2) {
				System.out.println("nesse dia sua placa esta em rodizio");
				}else {
					System.out.println("seu carro está liberado para circular");
				}
				System.out.println("Segunda");
			break;
			
			
		case 3:
			
			if((placa==3) || (placa==4)) {
				System.out.println("nesse dia sua placa esta em rodizio");
				}else {
				System.out.println("seu carro está liberado para circular");
				}
			break;
			
		case 4:
			if((placa==5) || (placa==6)) {
				System.out.println("nesse dia sua placa esta em rodizio");
				}else {
				System.out.println("seu carro está liberado para circular");
				}
				System.out.println("Quarta");
			break;
			
		case 5:
			if((placa==7) || (placa==8)) {
				System.out.println("nesse dia sua placa esta em rodizio");
			}else {
				System.out.println("seu carro está liberado para circular");
				}
				System.out.println("Quinta");
				break;
				
		case 6:
			if((placa==1) || (placa==2)) {
				System.out.println("nesse dia sua placa esta em rodizio");
			}else {
				System.out.println("seu carro está liberado para circular");
				}
				System.out.println("Sexta");
				break;
				
		case 7:
		case 1:
				System.out.println("nesse dia nao tem rodizio");
				System.out.println("Sabado");
				break;
		}
	
	
}

	

}
