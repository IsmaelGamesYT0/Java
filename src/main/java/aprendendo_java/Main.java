package aprendendo_java;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        String nome;
        int idade;
        ArrayList<String> listaNomes = new ArrayList<>();
        int download;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.printf("Olá, %s! Seja bem-vindo(a) ao meu programa em Java!\n", nome);
        listaNomes.add(nome);
        listaNomes.add("Claudinei");
        listaNomes.add("Robson");
        listaNomes.add("Junhinho");


        for(download = 0; download <= 100; download ++) {
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

        System.out.print("obrigado por usar meu programa!\n");

        for (String nomes : listaNomes) {
            System.out.println("Nomes na lista: ");
            System.out.println(nomes);
        }
    }
}