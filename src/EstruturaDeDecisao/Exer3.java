package EstruturaDeDecisao;

import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1ª nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("2ª nota: ");
        float nota2 = scanner.nextFloat();

        int media = (int) Math.floor((nota1 + nota2) / 2); // Arredondando pra baixo

        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
