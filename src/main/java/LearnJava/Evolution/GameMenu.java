package LearnJava.Evolution;
import java.util.Scanner;

public class GameMenu {
    public static void main(String[] args) throws InterruptedException {
        int opcao;
        Scanner scanner = new Scanner(System.in);

        System.out.print("[1] - Iniciar Jogo\n");
        System.out.print("[2] - Carregar jogo\n");
        System.out.print("[3] - Sair\n");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1: {
                System.out.println("\nIniciando novo jogo...");
                Thread.sleep(2000);
                System.out.println("\nJogo iniciado!");
                break;
            }
            case 2: {
                System.out.println("\nCarregando save...");
                Thread.sleep(3000);
                System.out.println("\nSave carregado com sucesso!");
                break;
            }
            case 3: {
                System.out.println("\nSaindo...");
                Thread.sleep(3000);
                break;
            }
            default: {
                System.out.println("Opção inválida!");
                break;
            }
        }
    }
}