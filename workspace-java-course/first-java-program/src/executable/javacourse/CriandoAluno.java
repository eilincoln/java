package executable.javacourse;

import classes.javacourse.Aluno;

public class CriandoAluno {
	public static void main(String[] args) {
		//Criando objeto atrav�s da classe
		
		// new Aluno(); -> � uma inst�ncia (� a cria��o de um objeto literal)
		// quando eu crio o aluno1 ou os outros, eu fa�o uma refer�ncia a classe aluno, que � um objeto
		Aluno aluno1 = new Aluno(); //Criado sem par�metro
		
		Aluno aluno2 = new Aluno("Lincoln"); //criado com 1 par�metro
		
		Aluno aluno3 = new Aluno("Lincoln2", 25); // Criando com 2 par�metros
	}
}
