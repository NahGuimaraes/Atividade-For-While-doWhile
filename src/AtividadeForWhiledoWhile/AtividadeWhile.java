package AtividadeForWhiledoWhile;

import java.util.Scanner;

public class AtividadeWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int menoresDe21 = 0; // Contador para pessoas menores de 21 anos
        int maioresDe50 = 0; // Contador para pessoas maiores de 50 anos

        while (true) {
            // Leitura da idade
            System.out.print("Digite uma idade: ");
            int idade = scanner.nextInt();

            // Verificação se a idade é negativa para finalizar a leitura
            if (idade < 0) {
                break;
            }

            // Incremento dos contadores conforme a idade
            if (idade < 21) {
                menoresDe21++;
            } else if (idade > 50) {
                maioresDe50++;
            }
        }

        // Exibição dos resultados
        System.out.println("\nTotal de pessoas menores de 21 anos: " + menoresDe21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maioresDe50);

        // Fechando o scanner
        scanner.close();
    

	}

}
