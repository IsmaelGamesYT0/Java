package LearnJava.challenges;

import java.util.Scanner;

public class DoubleTripleRoot {
    public static void main(String[] args) {
        int numero, duplo, triplo, raiz;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor informe um número: \n");
        numero = scanner.nextInt();

        duplo = numero * 2;
        triplo = numero * 3;
        raiz = (int) Math.sqrt(numero);

        System.out.printf("Segue abaixo o duplo, triplo e raiz do número %d \n", numero);

        System.out.printf("O duplo é %d.\n", duplo);
        System.out.printf("O triplo é %d.\n", triplo);
        System.out.printf("A raiz é %d.\n", raiz);

        // Finalizado em 03m 15s
    }
}
