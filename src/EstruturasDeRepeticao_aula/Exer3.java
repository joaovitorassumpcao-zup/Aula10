package EstruturasDeRepeticao_aula;

import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "º número: ");
            soma += scanner.nextInt();
        }

        System.out.println("Soma: " + soma);
    }
}
