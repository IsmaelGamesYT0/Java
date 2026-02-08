package LearnJava.challenges;
import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        double metros, cm, mm;
        int conversao;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira a medida em metros: Exemplo: 5,45");
        metros = scanner.nextDouble();

        cm = metros * 100;
        mm = metros * 1000;

        System.out.println("[1] - Metros para cm");
        System.out.println("[2] - Metros para mm");
        System.out.println("Qual conversão você gostaria de fazer? ");
        conversao = scanner.nextInt();

        if (conversao == 1) {
            System.out.printf("Sua medida de %.2fm em cm é %.1fcm.\n",  metros, cm);
        }
        else if (conversao == 2) {
            System.out.printf("Sua medida de %.2fm em mm é %,2fmm.\n", metros, mm);
        }
        else {
            System.out.println("Opção inválida");
        }
    }
}