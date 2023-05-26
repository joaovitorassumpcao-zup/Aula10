package EstruturaDeDecisao;

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1º número: ");
        int num1 = scanner.nextInt();

        System.out.print("2º número: ");
        int num2 = scanner.nextInt();

        if (num2 > num1) {
            System.out.println("Número maior: " + num2);
        } else {
            System.out.println("Número maior: " + num1);
        }
    }
}
