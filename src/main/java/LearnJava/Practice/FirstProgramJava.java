package LearnJava.Practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FirstProgramJava {
    static void main(String[] ignoredArgs) throws InterruptedException {
        String nome;
        int idade;
        int download;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.printf("Olá, %s! Seja bem-vindo(a) ao meu programa em Java!\n", nome);
        ArrayList<String> listaNomes = new ArrayList<>(Arrays.asList(nome, "Maria", "João", "Ana", "Carlos"));

        for (download = 0; download <= 100; download++) {
            System.out.printf("Downloading the list... %d%% \n", download);
            Thread.sleep(100);
        }
        System.out.println("Download completo!");
        Thread.sleep(1500);
        System.out.println("Lista de nomes atualizada!");

        System.out.print("\nAgora informe a sua idade: ");
        idade = scanner.nextInt();
        scanner.close();

        if (idade >= 18) {
            System.out.println("Entrada permitida!");
        } else {
            System.out.println("Entrada bloqueada!");
            return;
        }
        System.out.println("Nomes na lista: " + listaNomes);
        System.out.print("Obrigado por usar meu programa!\n");
    }
}