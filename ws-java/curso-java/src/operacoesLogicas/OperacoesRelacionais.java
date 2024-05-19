package operacoesLogicas;

import java.util.Scanner;

public class OperacoesRelacionais {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double nota1 = entrada.nextDouble();
		double nota2 = entrada.nextDouble();
		
		if(nota1 == nota2) {
			System.out.println("As notas são iguais");
		} else {
			System.out.println("Não são iguais");
		}
		
		if(nota1 != nota2) {
			System.out.println("As notas são diferentes");
		} else {
			System.out.println("São iguais");
		}
		
		if(nota1 <= nota2) {
			System.out.println("nota 1 é igual ou menor que a 2");
		} else {
			System.out.println("nota 2 é maior");
		}
		
		entrada.close();
	}
}
