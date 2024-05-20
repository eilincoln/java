package classes.javacourse;

public class Aluno {
	
	String nome;
	int idade;
	String curso;
	int ra;
	String nomeMae;
	
	public Aluno() { // crio um objeto vazio
	}
	
	public Aluno(String nomePadrao) {// posso criar com parâmetro
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) { // posso criar com mais um um parâmetro
		nome = nomePadrao;
		idade = idadePadrao;
	}

}
