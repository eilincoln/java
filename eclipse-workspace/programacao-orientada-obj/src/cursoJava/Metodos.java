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
		
		String disciplina1 = JOptionPane.showInputDialog("Nome da disciplina1: ");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 1: "));
		
		String disciplina2 = JOptionPane.showInputDialog("Nome da disciplina2: ");
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 2: "));
		
		String disciplina3 = JOptionPane.showInputDialog("Nome da disciplina3: ");
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 3: "));
		
		String disciplina4 = JOptionPane.showInputDialog("Nome da disciplina4: ");
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 4: "));
		
		// instanciando dados recebidos no obj
		Aluno aluno01 = new Aluno(nome, Integer.valueOf(ra));
		aluno01.setCurso(curso);
		aluno01.setNomeMae(nomeMae);
		aluno01.getDisciplina().setNota1(nota1);
		aluno01.getDisciplina().setNota2(nota2);
		aluno01.getDisciplina().setNota3(nota3);
		aluno01.getDisciplina().setNota4(nota4);
		
		aluno01.getDisciplina().setDisciplina1(disciplina1);
		aluno01.getDisciplina().setDisciplina2(disciplina2);
		aluno01.getDisciplina().setDisciplina3(disciplina3);
		aluno01.getDisciplina().setDisciplina4(disciplina4);
		
		System.out.println("Aluno: " + aluno01.getNome());
		System.out.println("RA: " + aluno01.getRa());
		System.out.println("Curso: " + aluno01.getCurso());
		System.out.println("Nome da mãe: " + aluno01.getNomeMae());
		System.out.println("Media: " + aluno01.getMediaNota());
		System.out.println("Resultdo: " + (aluno01.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		
		System.out.println("Méria do aluno: " + aluno01.getNome() + " é: " + aluno01.getMediaNota());
		System.out.println("Resultado: " + (aluno01.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("O aluno: " + aluno01.getNome() + " tem o RA: " + aluno01.getRa());
		System.out.println("Faz o curso: " + aluno01.getCurso() + " e o nome da mãe é: " + aluno01.getNomeMae());
		
		System.out.println(aluno01.toString());
		
		/*===============================================================================*/
		
//		Aluno aluno1 = new Aluno("Lincoln");
//		Aluno aluno2 = new Aluno("Lincoln");
//		
//		if(aluno1.equals(aluno2)) {
//			System.out.println("Alunos IGUAIS");
//		} else {
//			System.out.println("Alunos DIFERENTES");
//		}
	}
}
