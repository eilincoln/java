package cursoJava;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Disciplina;

public class Metodos {
	public static void main(String[] args) {
		
		/*Recebendo dados*/
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno: ");
		String ra = JOptionPane.showInputDialog("Qual o RA: ");	
		String curso = JOptionPane.showInputDialog("Qual curso: ");
	
		
		// instanciando dados recebidos no obj
		Aluno aluno01 = new Aluno(nome, Integer.valueOf(ra));
		aluno01.setCurso(curso);
//		aluno01.setNomeMae(nomeMae);
		
		Disciplina disciplina001 = new Disciplina();
		disciplina001.setDisciplina("Banco de Dados");
		disciplina001.setNota(90);

		Disciplina disciplina002 = new Disciplina();
		disciplina002.setDisciplina("Física");
		disciplina002.setNota(80);
		
		Disciplina disciplina003 = new Disciplina();
		disciplina003.setDisciplina("Math");
		disciplina003.setNota(60);
		
		Disciplina disciplina004 = new Disciplina();
		disciplina004.setDisciplina("Portuguese");
		disciplina004.setNota(60);

		aluno01.getDisciplina().add(disciplina001);
		aluno01.getDisciplina().add(disciplina002);
		aluno01.getDisciplina().add(disciplina003);
		aluno01.getDisciplina().add(disciplina004);
		
		
		
	
		
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
		
		
	}
}
