package executable.javacourse;

public class TrabalhandoComChar {

	public static void main(String[] args) {
		
		// CHAR representa somente uma letra
		char generoPessoa = 'M'; //tem que ser com aspas simples e n�o pode ser com duplas
		
		System.out.println("Qual o gen�ro da pessoa? " + generoPessoa);
		
		if(generoPessoa == 'F') {
			System.out.println("Feminino");
		} else {
			System.out.println("Masculino");
		}
	}
}
