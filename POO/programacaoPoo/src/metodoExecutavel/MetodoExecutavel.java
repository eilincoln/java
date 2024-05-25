package metodoExecutavel;

import javax.swing.JOptionPane;

import classes.Aluno;

public class MetodoExecutavel {
	public static void main(String[] args) {
		//Cria��o do objeto do aluno
		Aluno aluno = new Aluno();
		
		//Entrada de dados do aluno
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno: "));
		String curso = JOptionPane.showInputDialog("Qual o curso do aluno: ");
		int ra = Integer.parseInt(JOptionPane.showInputDialog("Qual � o ra do aluno: "));
		
		String materia1 = JOptionPane.showInputDialog("Qual materia: ");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("NOTA 1: "));

		String materia2 = JOptionPane.showInputDialog("Qual materia: ");
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("NOTA 2: "));
		
		String materia3 = JOptionPane.showInputDialog("Qual materia: ");
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("NOTA 3: "));
		
		String materia4 = JOptionPane.showInputDialog("Qual materia: ");
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("NOTA 4: "));
		
		aluno.setNome(nome);
		aluno.setIdade(idade);
		aluno.setCurso(curso);
		aluno.setRa(ra);
		
		aluno.getMateria().setNota1(nota1);
		aluno.getMateria().setNota2(nota2);
		aluno.getMateria().setNota3(nota3);
		aluno.getMateria().setNota4(nota4);
		
		aluno.getMateria().setMateria1(materia1);
		aluno.getMateria().setMateria2(materia2);
		aluno.getMateria().setMateria3(materia3);
		aluno.getMateria().setMateria4(materia4);
		
		
		//Sa�da dos dados
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
