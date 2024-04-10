package switchCase;

import java.util.Scanner;

public class Condicional2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dia;
		System.out.println("Informe o dia da semana:"); {
			dia=ler.nextInt();

			switch (dia) {
			case 1: 
				System.out.println("Hoje é domingo! ");
				break;
			case 2:
				System.out.println("Hoje é segunda!");
				break;
			case 3: 
				System.out.println("Hoje é terça!");
				break;
			case 4:
				System.out.println("Hoje é quarta!");
				break;
			case 5:
				System.out.println("Hoje é quinta!");
				break;
			case 6: 
				System.out.println("Hoje é sexta!");
				break;
			case 7:
				System.out.println("Hoje é sábado!");
			default:
				System.out.println("O número escolhido é inválido!Digite um número de 1 a 7.");
			}

ler.close();
		}

	}

}
