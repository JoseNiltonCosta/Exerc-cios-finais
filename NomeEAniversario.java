import java.util.Scanner;

public class NomeEAniversario {

	public static void main(String[] args) {
		int dia, mes, anasc, aatual, idade;
		String nome;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite seu nome");
		nome=in.nextLine();
		
		
		System.out.println(nome+" digite o ano atual");
		aatual=in.nextInt();
		
		System.out.println("digite o seu ano de nascimento");
		anasc=in.nextInt();
		if(anasc>aatual) {
			System.out.println("ano digitado invalido");
		}else {
		
		System.out.println("Digite um numero para o mês em que voce nascel");
		mes=in.nextInt();
		if(mes>12) {
			System.out.println("Mês digitado invalido");
		}else {
		
		System.out.println("E digite o dia em que voce nasceu");
		dia=in.nextInt();
		
		idade=aatual-anasc;
		
		switch(mes){
		case 1:
			if(dia < 31) {
			System.out.println(nome+" voce nasceu no dia "+dia + " Janeiro de "+ anasc);
			System.out.println(" E voce está com "+ idade);
			}else{
				System.out.println("foi digitado um dia incorreto");
			}break;
		case 2:
			if(dia<29) {
				System.out.println(nome+" voce nasceu no dia "+dia + " Fevereiro de "+ anasc);
				System.out.println(" E voce está com "+ idade);
			}else {
				System.out.println("foi digitado um dia incorreto");
			}break;
		case 3:
			if(dia<31) {
				System.out.println(nome+" voce nasceu no dia "+dia + " Março de "+ anasc);
				System.out.println(" E voce está com "+ idade);
			}else {
				System.out.println("foi digitado um dia incorreto");
			}break;
		case 4:
			if(dia<30) {
				System.out.println(nome+" voce nasceu no dia "+dia + " Abril de "+ anasc);
				System.out.println(" E voce está com "+ idade);
			}else {
				System.out.println("foi digitado um dia incorreto");
			}break;
		case 5:
			if(dia<31) {
				System.out.println(nome+" voce nasceu no dia "+dia + " Maio de "+ anasc);
				System.out.println(" E voce está com "+ idade);
			}else {
				System.out.println("foi digitado um dia incorreto");
			}break;
		case 6:
			if(dia<30) {
				System.out.println(nome+" voce nasceu no dia "+dia + " Junho de "+ anasc);
				System.out.println(" E voce está com "+ idade);
			}else {
				System.out.println("foi digitado um dia incorreto");
			}break;
		case 7:
			if(dia<31) {
				System.out.println(nome+" voce nasceu no dia "+dia + " Julho de "+ anasc);
				System.out.println(" E voce está com "+ idade);
			}else {
				System.out.println("foi digitado um dia incorreto");
			}break;
		case 8:
			if(dia<31) {
				System.out.println(nome+" voce nasceu no dia "+dia + " Agosto de "+ anasc);
				System.out.println(" E voce está com "+ idade);
			}else {
				System.out.println("foi digitado um dia incorreto");
			}break;
		case 9:
			if(dia<30) {
				System.out.println(nome+" voce nasceu no dia "+dia + " Setembro de "+ anasc);
				System.out.println(" E voce está com "+ idade);
			}else {
				System.out.println("foi digitado um dia incorreto");
			}break;
		case 10:
			if(dia<31) {
				System.out.println(nome+" voce nasceu no dia "+dia + " Outubro de "+ anasc);
				System.out.println(" E voce está com "+ idade);
			}else {
				System.out.println("foi digitado um dia incorreto");
			}break;
		case 11:
			if(dia<30) {
				System.out.println(nome+" voce nasceu no dia "+dia + " Novembro de "+ anasc);
				System.out.println(" E voce está com "+ idade);
			}else {
				System.out.println("foi digitado um dia incorreto");
			}break;
		case 12:
			if(dia<31) {
				System.out.println(nome+" voce nasceu no dia "+dia + " Dezembro de "+ anasc);
				System.out.println(" E voce está com "+ idade);
			}else {
				System.out.println("foi digitado um dia incorreto");
			}break;
			default :
				System.out.println("Mês digitado incorreto");
				}
			}
		}
	}

}
