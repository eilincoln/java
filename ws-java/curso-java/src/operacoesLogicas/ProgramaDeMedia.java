package operacoesLogicas;

import javax.swing.JOptionPane;

public class ProgramaDeMedia {
	public static void main(String[] args) {
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3: "));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4: "));
		
		double mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;
			
		if(mediaAluno >= 7.0) {
			JOptionPane.showMessageDialog(null, "Aluno APROVADO! Nota: " + mediaAluno);
		} else if(mediaAluno >= 5.0 && mediaAluno < 7.0) {
			JOptionPane.showMessageDialog(null, "Aluno em RECUPERÇÃO! Nota: " + mediaAluno);
		} else {
			JOptionPane.showMessageDialog(null, "Aluno REPROVADO! Nota: " + mediaAluno);
		}
		
	}
}
