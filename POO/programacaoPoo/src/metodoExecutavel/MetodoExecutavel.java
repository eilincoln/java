package metodoExecutavel;

import javax.swing.JOptionPane;

import classes.Aluno;

public class MetodoExecutavel {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno: "));
		String curso = JOptionPane.showInputDialog("Qual o curso do aluno: ");
		int ra = Integer.parseInt(JOptionPane.showInputDialog("Qual � o ra do aluno: "));
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("NOTA 1: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("NOTA 2: "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("NOTA 3: "));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("NOTA 4: "));
		
		aluno.setNome(nome);
		aluno.setIdade(idade);
		aluno.setCurso(curso);
		aluno.setRa(ra);
		aluno.setNota1(nota1);
		aluno.setNota2(nota2);
		aluno.setNota3(nota3);
		aluno.setNota4(nota4);
		
		
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Idade: " + aluno.getIdade());
		System.out.println("Curso: " + aluno.getCurso());
		System.out.println("RA: " + aluno.getRa());
		System.out.println("Situ��o: " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Media aluno: " + aluno.getMediaAluno());
		System.out.println("------------------------------------------------------------------");
		System.out.println(aluno);
		
		
	}
}
