package EstruturaDeRepeticao_entregar;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        boolean continuar = true;
        int input;

        System.out.println("Adicione números para a verificação (digite '0' para parar)");
        while (continuar) {
            System.out.print(" -> ");
            input = scanner.nextInt();

            if (input != 0) {
                arrayList.add(input);
            } else {
                continuar = false;
            }
        }

        int minimo = arrayList.get(0);
        int maximo = arrayList.get(0);

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) < minimo) {
                minimo = arrayList.get(i);
            }
        }

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) > minimo) {
                minimo = arrayList.get(i);
            }
        }

        System.out.println("Minímo é: " + minimo);
        System.out.println("Máximo é: " + maximo);
    }
}
