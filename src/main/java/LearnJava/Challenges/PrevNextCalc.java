package LearnJava.Challenges;
import java.util.Scanner;

public class PrevNextCalc {
    public static void main(String[] args) {
        int numero, sucessor, antecessor;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        numero = scanner.nextInt();

        sucessor = numero + 1;
        antecessor = numero - 1;

        System.out.printf("O seu número é %d o sucessor é %d e o antecessor é %d.",
                numero, sucessor, antecessor);

        scanner.close();

        // Finalizado em 02m 13s
    }
}