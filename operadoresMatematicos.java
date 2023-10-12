package questoes;

import java.util.Scanner;

public class operadoresMatematicos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		double num2 = scanner.nextDouble();
		
		System.out.print("Digite o operador (+, -, *, /): ");
		char operador = scanner.next().charAt(0);
		
		double resultado = 0.0;
		
		switch (operador) {
			case '+':
				resultado = num1 + num2;
				break;
			case '-':
				resultado = num1 - num2;
				break;
			case '*':
				resultado = num1 * num2;
				break;	
			case '/':
				if (num2 != 0) {
				resultado = num1 / num2;
				} else {
					System.out.println("Erro: Divis�o por zero.");
				}
				break;	
			default:
				System.out.println("Operador inv�lido.");
		}
		
		System.out.println("Resultado : " + resultado);
		
	}
}
