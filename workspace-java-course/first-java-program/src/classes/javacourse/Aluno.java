package classes.javacourse;

public class Aluno {
	
	/*tudo isso � um atributo do objeto aluno*/
	public String nome;
	public int idade;
	public String curso;
	public int ra;
	public String nomeMae;
	
	public Aluno() { // crio um objeto vazio
	}
	
	public Aluno(String nomePadrao) {// posso criar com par�metro
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) { // posso criar com mais um um par�metro
		nome = nomePadrao;
		idade = idadePadrao;
	}

}
