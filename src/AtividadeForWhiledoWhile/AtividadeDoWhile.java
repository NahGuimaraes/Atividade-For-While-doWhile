package AtividadeForWhiledoWhile;

import java.util.Scanner;

public class AtividadeDoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int soma = 0; // Variável para somar os múltiplos de 3
        int contador = 0; // Contador de múltiplos de 3

        int numero; // Variável para leitura dos números

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero % 3 == 0 && numero != 0) {
                soma += numero;
                contador++;
            }
        } while (numero != 0);

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.printf("\nA média de todos os números múltiplos de 3 é: %.1f\n", media);
        } else {
            System.out.println("\nNenhum número múltiplo de 3 foi digitado.");
        }

        // Fechando o scanner
        scanner.close();
    
	}

}
