package operacoesLogicas;

import javax.swing.JOptionPane;

public class EntradaDeDados {
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
		String pessoas = JOptionPane.showInputDialog("informe a quantidade de pessoas: ");
		
		double numeroCarros = Double.parseDouble(carros);
		double numeroPessoas = Double.parseDouble(pessoas);
		
		int divisao = (int) (numeroCarros % numeroPessoas);
		
		
		
		System.out.printf("A quantidade de sobra foi: %d", divisao);
		
	}
}
