package EstruturasDeRepeticao_aula;

import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, size = 0;
        int input;
        boolean i = true;

        System.out.println("Adicione números para a média (entre '0' para parar)");
        while (i) {
            System.out.print(" -> ");
            input = scanner.nextInt();

            if (input != 0) {
                sum += input;
                size++;
            } else {
                i = false;
            }
        }

        System.out.println("Média: " + (sum / size));
    }
}
