package LearnJava.challenges;
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        double valor_original, desconto, valor_com_desconto;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exemplo: 1.834,89\n");
        System.out.println("Por favor, insira o valor original: ");
        valor_original = scanner.nextDouble();

        desconto = valor_original * 0.05;
        valor_com_desconto = valor_original - desconto;

        System.out.printf("Parabéns! Você ganhou um desconto de 5%% e agora só irá pagar R$%,.2f.", valor_com_desconto);

        scanner.close();

        // Finalizado em 03min 21s
    }
}