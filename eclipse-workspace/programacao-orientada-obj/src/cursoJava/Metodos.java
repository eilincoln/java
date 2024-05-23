package cursoJava;

import javax.swing.JOptionPane;

import classes.Aluno;

public class Metodos {
	public static void main(String[] args) {
		
		/*Recebendo dados*/
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno: ");
		String ra = JOptionPane.showInputDialog("Qual o RA: ");	
		String curso = JOptionPane.showInputDialog("Qual curso: ");
		String nomeMae = JOptionPane.showInputDialog("Qual é o nome da mãe: ");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 1: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 2: "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 3: "));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 4: "));
		
		// instanciando dados recebidos no obj
		Aluno aluno01 = new Aluno(nome, Integer.valueOf(ra));
		aluno01.setCurso(curso);
		aluno01.setNomeMae(nomeMae);
		aluno01.setNota1(nota1);
		aluno01.setNota2(nota2);
		aluno01.setNota3(nota3);
		aluno01.setNota4(nota4);
		
		System.out.println("Aluno: " + aluno01.getNome());
		System.out.println("RA: " + aluno01.getRa());
		System.out.println("Curso: " + aluno01.getCurso());
		System.out.println("Nome da mãe: " + aluno01.getNomeMae());
		System.out.println("Media: " + aluno01.getMediaNota());
		System.out.println("Resultdo: " + (aluno01.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		
		
//		System.out.println("Méria do aluno: " + aluno01.getNome() + " é: " + aluno01.getMediaNota());
//		System.out.println("Resultado: " + (aluno01.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
//		System.out.println("O aluno: " + aluno01.getNome() + " tem o RA: " + aluno01.getRa());
//		System.out.println("Faz o curso: " + aluno01.getCurso() + " e o nome da mãe é: " + aluno01.getNomeMae());
		
		/*===============================================================================*/
	}
}
