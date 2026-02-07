package LearnJava.practice;
import java.util.Scanner;

public class SalaryAverageCalculator {
    public static void main(String[] args) {
        double salario1, salario2, salario3, salario4, salario5;
        double media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá Seja bem-vindo ao meu programa de calcular média salarial.");
        System.out.print("\n");

        System.out.println("Você deve informar o salario assim: Exemplo: 1.984,82");
        System.out.print("\n");

        System.out.print("Por favor informe o primeiro salario: ");
        salario1 = scanner.nextDouble();
        System.out.print("\n");

        System.out.print("Por favor informe o segundo salario: ");
        salario2 = scanner.nextDouble();
        System.out.print("\n");

        System.out.print("Por favor informe o terceiro salario: ");
        salario3 = scanner.nextDouble();
        System.out.print("\n");

        System.out.print("Por favor informe o quarto salario: ");
        salario4 = scanner.nextDouble();
        System.out.print("\n");

        System.out.print("Por favor informe o quinto salario: ");
        salario5 = scanner.nextDouble();
        System.out.print("\n");

        media = (salario1 + salario2 + salario3 + salario4 + salario5) / 5;

        System.out.print("\n");
        System.out.printf("A média salarial é de R$%.2f", media);
    }
}