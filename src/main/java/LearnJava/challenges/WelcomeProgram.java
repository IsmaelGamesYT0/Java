package LearnJava.challenges;

import java.util.Scanner;

public class WelcomeProgram {
    public static void main(String[] args) {
        String nome;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, informe seu nome: \n");
        nome = scanner.nextLine();

        System.out.printf("Olá %s prazer em conhece-lo!", nome);

        // Finalizado em 01m 52s

    }
}
