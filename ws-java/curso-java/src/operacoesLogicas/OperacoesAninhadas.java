package operacoesLogicas;

import java.util.Scanner;

public class OperacoesAninhadas {
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
		
		if(mediaFinal >= 7 ) {
			System.out.println("Aluno aprovado");
		} else if (mediaFinal >= 6 && mediaFinal < 7) {
			System.out.println("Aluno de recuperação");
		} else {
			System.out.println("Aluno reprovado");
		}
		System.out.println("Média final = " + mediaFinal);
		
		entrada.close();
	}

}
