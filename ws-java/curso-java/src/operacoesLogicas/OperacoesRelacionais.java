package operacoesLogicas;

import java.util.Scanner;

public class OperacoesRelacionais {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double nota1 = entrada.nextDouble();
		double nota2 = entrada.nextDouble();
		
		if(nota1 == nota2) {
			System.out.println("As notas s�o iguais");
		} else {
			System.out.println("N�o s�o iguais");
		}
		
		if(nota1 != nota2) {
			System.out.println("As notas s�o diferentes");
		} else {
			System.out.println("S�o iguais");
		}
		
		if(nota1 <= nota2) {
			System.out.println("nota 1 � igual ou menor que a 2");
		} else {
			System.out.println("nota 2 � maior");
		}
		
		entrada.close();
	}
}
