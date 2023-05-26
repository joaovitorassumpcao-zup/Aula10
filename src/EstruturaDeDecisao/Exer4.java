package EstruturaDeDecisao;

import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Seu salário: ");
        int salario = scanner.nextInt();
        int reajuste, perc;

        if (salario >= 1500) {
            reajuste = (int) (salario * 0.05);
            perc = 5;
        } else if (salario >= 700) {
            reajuste = (int) (salario * 0.10);
            perc = 10;
        } else if (salario >= 280) {
            reajuste = (int) (salario * 0.15);
            perc = 15;
        } else {
            reajuste = (int) (salario * 0.20);
            perc = 20;
        }

        System.out.printf(" salário:      | %.2f%n", (float) (salario));
        System.out.printf(" percentual:   | %d%% %n", perc);
        System.out.printf(" aumento:      | %.2f%n", (float) (reajuste));
        System.out.println("               |--------");
        System.out.printf(" reajustado:   | %.2f%n", (float) (salario + reajuste));
    }
}
