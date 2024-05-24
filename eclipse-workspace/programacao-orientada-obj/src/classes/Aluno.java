package classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	public String nome;
	public int ra;
	public String curso;
	public String nomeMae;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>(); 
	
	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplinas = disciplina;
	}
	
	public List<Disciplina> getDisciplina() {
		return disciplinas;
	}

	public Aluno () {
		
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno (String nomePadrao, int raPadrao) {
		nome = nomePadrao;
		ra = raPadrao;
	}
	
	/*Veremos os metodos SET e GET*/
	// set é para adicionar
	// get é para puxar
	
	
	public void setNome(String nome) {
		this.nome = nome; // aqui é um método set, que ele está recebendo dados, quando eu coloco o this
	}
	
	public String getNome() {
		return nome;
	} // daqui para cima foi eu que fiz

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	// quando eu tenho tudo assim facil, eu posso fazer aqui direto! Não preciso mandar para outra parte do sistema
	public double getMediaNota() {
		double somaNotas = 0.0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas = somaNotas + disciplina.getNota();
		}
		return somaNotas / disciplinas.size();
	}
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 70) {
			return true;
		} else {
			return false;
		}
	}
	
	//geralmente é melhorar usar o modelo de cima, pq deixamos as strings para processamento de tela
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if(media >= 70) {
			return "Aluno aprovado";
		} else {
			return "Aluno reprovado";
		}
	}
	
	

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", ra=" + ra + ", curso=" + curso + ", nomeMae=" + nomeMae + ", disciplina="
				+ disciplinas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ra;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (ra != other.ra)
			return false;
		return true;
	}
	
	
}