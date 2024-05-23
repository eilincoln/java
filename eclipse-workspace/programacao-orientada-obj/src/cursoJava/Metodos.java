package cursoJava;

import classes.Aluno;

public class Metodos {
	public static void main(String[] args) {
		
		Aluno aluno01 = new Aluno("Lincoln", 202208254);
		aluno01.setCurso("Engenharia de Software");
		aluno01.setNomeMae("Fabiana Semiano");
		
		aluno01.setNota1(90);
		aluno01.setNota2(80.2);
		aluno01.setNota3(40.5);
		aluno01.setNota4(79.3);
		System.out.println("Méria do aluno: " + aluno01.getNome() + " é: " + aluno01.getMediaNota());
		System.out.println("Resultado: " + (aluno01.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		
		System.out.println("O aluno: " + aluno01.getNome() + " tem o RA: " + aluno01.getRa());
		System.out.println("Faz o curso: " + aluno01.getCurso() + " e o nome da mãe é: " + aluno01.getNomeMae());
		
		/*===============================================================================*/
		
		
		Aluno aluno02 = new Aluno();
		aluno02.setNome("Carlos da Silva");
//		System.out.println("Nome do aluno set é: " + aluno02.getNome());
		
		
		
		
		//System.out.println(aluno01.nome);
		
	}
}
