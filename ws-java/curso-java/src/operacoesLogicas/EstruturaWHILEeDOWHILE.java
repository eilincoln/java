package operacoesLogicas;

public class EstruturaWHILEeDOWHILE {
	public static void main(String[] args) {
		/*Estrutura WHILE*/
		int numero = 3; // sempre verifica antes de executar o código
		while (numero <= 7) {// sempre verifica antes de executar o código
			System.out.println("O numero é: " + numero);
			numero++;
		}
		
		int numero2 = 0;
		do {
			System.out.println("numero 2: " + numero2);
			numero2++;
		} while (numero2 <= 10);
	}

}
