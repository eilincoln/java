package executable.javacourse;

import classes.javacourse.Aluno;

public class CriandoAluno {
	public static void main(String[] args) {
		//Criando objeto atrav�s da classe
		
		// new Aluno(); -> � uma inst�ncia (� a cria��o de um objeto literal)
		// quando eu crio o aluno1 ou os outros, eu fa�o uma refer�ncia a classe aluno, que � um objeto
		Aluno aluno1 = new Aluno(); //Criado sem par�metro
		aluno1.nome = "Pedro";
		aluno1.idade = 20;
		aluno1.curso = "Medicina";
		aluno1.nomeMae = "Gisele Semiano dos Santos";
		aluno1.ra = 24249777;
		
		System.out.println("O nome da m�e do aluno: " + aluno1.nomeMae);
		
		Aluno aluno2 = new Aluno("Lincoln"); //criado com 1 par�metro
		aluno2.idade = 22;
		
		Aluno aluno3 = new Aluno("Lincoln2", 25); // Criando com 2 par�metros
		aluno3.nomeMae = "Fabiana Semiano dos Santos";
	}
}
