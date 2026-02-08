package LearnJava.challenges;
import java.util.Scanner;
import java.util.Locale;

public class SalaryAdjustment {
    public static void main(String[] args) {
        Locale.forLanguageTag("pt-BR");
        double salario_atual, salario_reajustado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exemplo: 1.586,83");
        System.out.println("Por favor, insira seu salario atual: ");
        salario_atual = scanner.nextDouble();
        salario_reajustado = salario_atual * 1.15;

        System.out.println("Seu salario teve um aumento de 15%");
        System.out.printf("Agora você irá receber um salario de R$%,.2f.", salario_reajustado);

        // Finalizado em 04min 50s
    }
}