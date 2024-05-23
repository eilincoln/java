package classes;

public class Aluno {
	public String nome;
	public int ra;
	public String curso;
	public String nomeMae;
	
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public Aluno () {
		
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
		return (nota1 + nota2 + nota3 + nota4) / 4;
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
}