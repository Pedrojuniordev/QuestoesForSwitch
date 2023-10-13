package questoes;

import java.util.Scanner;

public class diasNoMes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número do mês de 1 a 12: ");
		int mes = scanner.nextInt();
		
		int diasNoMes = 0;
		
		switch (mes) {
		case 1: // Janeiro
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			diasNoMes = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diasNoMes = 30;
			break;
		case 2:
			diasNoMes = 28;
			break;
		default:
			System.out.println("Mês inválido.");
		}
		
		System.out.println("O mês " + mes + " tem "+ diasNoMes + " dias.");
	}

}
