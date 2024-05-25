package metodoExecutavel;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Materia;

public class MetodoExecutavel {
	public static void main(String[] args) {
		
		//Entrada de dados do aluno
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno: "));
		String curso = JOptionPane.showInputDialog("Qual o curso do aluno: ");
		int ra = Integer.parseInt(JOptionPane.showInputDialog("Qual � o ra do aluno: "));

		
		//Cria��o do objeto do aluno
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setIdade(idade);
		aluno.setCurso(curso);
		aluno.setRa(ra);
		
		for(int pos = 1; pos <= 4; pos++) {
			String nomeMateria = JOptionPane.showInputDialog("Qual o nome da materia " + pos + ": ");
			String notaMateria = JOptionPane.showInputDialog("Qual nota: ");
			
			Materia materia = new Materia();
			
			materia.setMateria(nomeMateria);
			materia.setNota(Double.valueOf(notaMateria));
			
			aluno.getMaterias().add(materia);
		}
		
		//Remover materia
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma mat�ria ?");
		if (escolha == 0) {
			String materiaRemover = JOptionPane.showInputDialog("Qual a materia? entre as 4");
			aluno.getMaterias().remove(Integer.valueOf(materiaRemover).intValue() - 1);
		}
		
		//Sa�da dos dados
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Idade: " + aluno.getIdade());
		System.out.println("Curso: " + aluno.getCurso());
		System.out.println("RA: " + aluno.getRa());
		System.out.println("Situ��o: " + aluno.getAlunoAprovado());
		System.out.println("Media aluno: " + aluno.getMediaAluno());
		System.out.println("------------------------------------------------------------------");
		System.out.println(aluno); 
		
		
	}
}
