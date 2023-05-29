package EstruturaDeRepeticao_entregar;

import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número à ser verificado: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println("Não é primo");
            return;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Não é primo");
                return;
            }
        }

        System.out.println("É primo!");
    }
}
