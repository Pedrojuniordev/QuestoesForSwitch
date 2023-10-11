package questoes;

import java.util.Scanner;

public class mediaNnumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos números deseja calcular a média ? ");
		int n = scanner.nextInt();
		
		if (n <= 0) {
			System.out.println("Insira números para calcular a média. ");
		}
		
		double soma = 0.0;
		for (int i = 1; i <= n; i++) {
		System.out.print("Digite o número" + i + ":");
		double numero = scanner.nextDouble();
		soma += numero;
		}
		
		double media = soma / n;
		System.out.println("A media dos números inseridos é: " + media);
	}

}
