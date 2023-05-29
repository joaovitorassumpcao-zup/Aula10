package EstruturaDeRepeticao_entregar;

import java.util.Arrays;
import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Defina o inicio do intervalo: ");
        int intervaloInicio = scanner.nextInt();

        System.out.print("Defina o fim do intervalo: ");
        int intervaloFim = scanner.nextInt();

        if (intervaloInicio >= intervaloFim) {
            System.out.println("Intervalo de valores inválido!");
            return;
        }

        int soma = 0;

        for (int i = intervaloInicio; i <= intervaloFim; i++) {
            if (i % 2 != 0) {
                soma += i;
                System.out.println("+ " + i);
            }
        }

        System.out.println("Total: " + soma);
    }
}
