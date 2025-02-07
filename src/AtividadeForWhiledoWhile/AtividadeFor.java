package AtividadeForWhiledoWhile;

import java.util.Scanner;

public class AtividadeFor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int pares = 0; // Variável para contar números pares
        int impares = 0; // Variável para contar números ímpares

        // Laço de repetição para ler 10 números inteiros
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº número: ", i);
            int numero = scanner.nextInt();

            // Verificação se o número é par ou ímpar
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Exibição do resultado
        System.out.println("\nTotal de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);

        // Fechando o scanner
        scanner.close();
   
	
	}

}
