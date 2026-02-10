package LearnJava.evolution;
import java.util.Scanner;

public class Vectors {
    public static void main(String[] args) {
        int[] list = new int[5];
        String[] numeros = {
                "primeiro",
                "segundo",
                "terceiro",
                "quarto",
                "quinto",
        };
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Insira %s número:", numeros[i]);
            list[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list[i]);
        }
    }
}