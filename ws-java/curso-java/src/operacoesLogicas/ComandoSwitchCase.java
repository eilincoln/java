package operacoesLogicas;

import java.util.Scanner;

public class ComandoSwitchCase {
	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite a nota 1 do aluno: ");
		double nota1 = entrada.nextDouble();
		System.out.println("digite a nota 2 do aluno: ");
		double nota2 = entrada.nextDouble();
		System.out.println("digite a nota 3 do aluno: ");
		double nota3 = entrada.nextDouble();
		System.out.println("digite a nota 4 do aluno: ");
		double nota4 = entrada.nextDouble();
		
		double mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*é usado para operações exatas*/
		
		int dia = 0;
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;

		default:
			System.out.println("Outro valor: " + mediaFinal);
			break;
		}
		
		entrada.close();
	}
}
