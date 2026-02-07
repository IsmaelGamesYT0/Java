package LearnJava.challenges;

import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) {
        int num1, num2;
        int soma;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: \n");
        num1 = scanner.nextInt();

        System.out.print("Insira o segundo número: \n");
        num2 = scanner.nextInt();

        soma = num1 + num2;

        System.out.printf("A soma entre %d e %d é igual à %d", num1, num2, soma);

        // Finalizado em 02m 12s
    }
}
