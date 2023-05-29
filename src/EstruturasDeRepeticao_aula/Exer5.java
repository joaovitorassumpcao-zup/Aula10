package EstruturasDeRepeticao_aula;

import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        System.out.println("10 na fila....");
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i >= 1; i--){
            System.out.println(i + " pessoas na fila...");
            scanner.next();
            System.out.println("Próximo!");
        }
    }
}
