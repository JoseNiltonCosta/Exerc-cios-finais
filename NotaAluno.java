import java.util.Scanner;

public class NotaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1,n2, media;
		Scanner ler = new Scanner(System.in);
		System.out.println(" digite a nota 1 do aluno ");
		n1=ler.nextFloat();
		System.out.println(" digite a nota 2 do aluno ");
		n2=ler.nextFloat();
		media=(n1 + n2)/2;
		System.out.println(" A media do aluno será " + media);

	}

}
