package questoes;

import java.util.Scanner;

public class sequenciaFibonnaci {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a quantidade de termos da sequência de Fibonacci a serem impressos: ");
	        int n = scanner.nextInt();

	        System.out.println("Os primeiros " + n + " termos da sequência de Fibonacci são:");
	        
	      
	        int primeiroTermo = 0;
	        int segundoTermo = 1;

	        
	        for (int i = 0; i < n; i++) {
	            System.out.print(primeiroTermo + " ");

	            int proximoTermo = primeiroTermo + segundoTermo;
	            primeiroTermo = segundoTermo;
	            segundoTermo = proximoTermo;
	        }
	    }
	}

