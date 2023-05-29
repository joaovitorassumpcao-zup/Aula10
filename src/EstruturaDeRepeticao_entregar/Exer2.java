package EstruturaDeRepeticao_entregar;

import java.util.ArrayList;
import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;
        int input;
        boolean i = true;

        System.out.println("Adicione números para a média (digite '0' para parar)");
        while (i) {
            System.out.print(" -> ");
            input = scanner.nextInt();

            if (input != 0) {
                arrayList.add(input);
            } else {
                i = false;
            }
        }

        for (int y = 0; y < arrayList.size(); y++) {
            sum += arrayList.get(y);
        }

        System.out.println("A média é: " + (sum / arrayList.size()));
    }
}
