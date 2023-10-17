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
			break;
		case 3:
			break;
		case 5:
			break;
		case 7:
			break;
		case 8:
			break;
		case 10:
			break;
		case 12:
			diasNoMes = 31;
			break;
		case 4:
			break;
		case 6:
			break;
		case 9:
			break;
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
