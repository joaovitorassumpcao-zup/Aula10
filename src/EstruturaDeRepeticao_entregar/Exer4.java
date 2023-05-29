package EstruturaDeRepeticao_entregar;

import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        int soma = 0;
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        int input;

        System.out.println("Adicione números para a soma (digite '0' ou menor para parar)");
        while (continuar) {
            System.out.print(" -> ");
            input = scanner.nextInt();

            if (input > 0) {
                soma += input;
            } else {
                continuar = false;
            }
        }

        System.out.println("Soma é: " + soma);
    }
}
