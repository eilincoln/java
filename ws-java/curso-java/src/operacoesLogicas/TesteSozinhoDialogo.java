package operacoesLogicas;

import javax.swing.JOptionPane;

public class TesteSozinhoDialogo {
	public static void main(String[] args) {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		int soma = numero1 + numero2;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver a soma?");
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "A soma é: " + soma);			
		}
		
		int subtrair = numero1 - numero2;
		resposta = JOptionPane.showConfirmDialog(null, "Fizemos uma subtração, deseja ver?");
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "A subtração é: " + subtrair);
		}
		
	}
}
