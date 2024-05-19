package operacoesLogicasECondicionais;

public class IfEElse {
	public static void main(String[] args) {
		int mediaAluno = 6;
		String nome = "Lincoln";
		
		if(mediaAluno >= 7 && nome.equals("Lincoln")) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
	}
}
