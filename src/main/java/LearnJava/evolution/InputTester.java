package LearnJava.evolution;
import java.util.Scanner;

public class InputTester {
    public static void main(String[] args) {
        String nome;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe o seu nome: ");
        nome = scanner.nextLine();

        System.out.printf("\nOlá, [%s]!", nome);
    }
}