package LearnJava.Evolution;
import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        nome = scanner.nextLine();

        System.out.print("\nInsira a sua idade: ");
        idade = scanner.nextInt();

        if(idade < 18 ) {
            System.out.println("Entrada bloqueada!");
        }
        System.out.printf("Olá [%s] Seja Bem-vindo ao meu programa!", nome);
        
        scanner.close();
    }
}