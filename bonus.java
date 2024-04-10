package switchCase;

import java.util.Scanner;

public class bonus {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anos;

		System.out.println("Informe à quantos anos você trabalha na empresa: ");
		anos = ler.nextInt();

		String msg = (anos > 3) ? "Seu bônus é de 7%." : "Seu bônus é de 5%";
		System.out.println(msg);
		ler.close();


	}

}
