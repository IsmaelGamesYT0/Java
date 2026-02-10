package LearnJava.evolution;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int code_secret = 42;
        int palpite = 0;
        Scanner scanner = new Scanner(System.in);

        while (palpite != code_secret) {
            System.out.print("\nInsira um número:\n");
            palpite = scanner.nextInt();

            if (palpite != code_secret) {
                System.out.print("\nVocê errou, Tente novamente!\n");
            }
        }
        System.out.println("\nParábens, você acertou!");
    }
}