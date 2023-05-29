package EstruturaDeRepeticao_entregar;

public class Exer7 {
    public static void main(String[] args) {
        int coni = 0, soma = 0, i = 0;

        while (coni <= 50) {
            i++;
            if (i % 2 != 0) {
                coni++;
                soma += i;
                System.out.println("+ " + i);
            }
        }

        System.out.println("Total: " + soma);
    }
}
