package questoes;

import java.util.Scanner;

public class diaSemana {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero de 1 a 7: ");
        int numero = scanner.nextInt();

        String diaSemana;
        
        switch (numero) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Ter�a-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "S�bado";
                break;
            default:
                diaSemana = "N�mero inv�lido, n�o corresponde a um dia da semana.";
                break;
            }
        
        System.out.println("O dia da semana correspondente �: " + diaSemana);
    }
}


