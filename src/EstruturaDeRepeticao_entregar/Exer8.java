package EstruturaDeRepeticao_entregar;

import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número a ser fatorado: ");
        int fato = scanner.nextInt();
        int total = 1;

        for (int i = 2; i <= fato; i++) {
            System.out.print(i + "! ");
            total *= i;
        }
        System.out.print("\nTotal: " + total);
    }
}
