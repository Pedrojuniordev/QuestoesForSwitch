package questoes;

import java.util.Scanner;

public class mediaNnumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos n�meros deseja calcular a m�dia ? ");
		int n = scanner.nextInt();
		
		if (n <= 0) {
			System.out.println("Insira n�meros para calcular a m�dia. ");
		}
		
		double soma = 0.0;
		for (int i = 1; i <= n; i++) {
		System.out.print("Digite o n�mero" + i + ":");
		double numero = scanner.nextDouble();
		soma += numero;
		}
		
		double media = soma / n;
		System.out.println("A media dos n�meros inseridos �: " + media);
	}

}
