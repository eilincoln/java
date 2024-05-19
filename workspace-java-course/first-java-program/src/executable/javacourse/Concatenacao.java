package executable.javacourse;

public class Concatenacao {
	public static void main(String[] args) {
		 // Concatenando usando o operador +
        String parte1 = "Olá";
        String parte2 = " Mundo!";
        String saudacao = parte1 + parte2;
        System.out.println("Usando +: " + saudacao);

        // Concatenando usando o método concat()
        String saudacaoConcat = parte1.concat(parte2);
        System.out.println("Usando concat(): " + saudacaoConcat);

        // Concatenando múltiplas strings
        String parte3 = " Este é um ";
        String parte4 = "exemplo de ";
        String parte5 = "concatenação.";
        String fraseCompleta = parte1 + parte2 + parte3 + parte4 + parte5;
        System.out.println("Concatenando múltiplas strings: " + fraseCompleta);

        // Usando StringBuilder para concatenação eficiente
        StringBuilder sb = new StringBuilder();
        sb.append(parte1);
        sb.append(parte2);
        sb.append(parte3);
        sb.append(parte4);
        sb.append(parte5);
        String fraseComBuilder = sb.toString();
        System.out.println("Usando StringBuilder: " + fraseComBuilder);

        // Comparando desempenho
        long inicio, fim;
        int n = 10000;

        // Usando +
        inicio = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo usando +: " + (fim - inicio) + "ms");

        // Usando StringBuilder
        inicio = System.currentTimeMillis();
        StringBuilder sbTempo = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbTempo.append("a");
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo usando StringBuilder: " + (fim - inicio) + "ms");
	}
}
