package operacoesLogicas;

public class RepeticaoComParada {
	public static void main(String[] args) {
		//estrutura com parada
		for(int i = 0; i <= 10; i++) {
			System.out.println("O número atual é: " + i);
			if(i == 7) {
				System.out.println("Opa! Encontrei o número 7");
				System.out.println("Vou parar por aqui!");
				break;
			}
		}
	}
}
