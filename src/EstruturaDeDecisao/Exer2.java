package EstruturaDeDecisao;

import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço do 1º produto: ");
        float prod1 = scanner.nextFloat();

        System.out.print("Preço do 2º produto: ");
        float prod2 = scanner.nextFloat();

        System.out.print("Preço do 3º produto: ");
        float prod3 = scanner.nextFloat();

        // Checar todos os casos requere 9 condicionais, então optei
        // por usar Math.min()

        float larg = Math.min(prod1, Math.min(prod2, prod3));

        System.out.println("Compre o produto de " + larg);
    }
}
