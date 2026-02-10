package LearnJava.evolution;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double a, b, soma, subtracao, mult, div, raiz;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        a = scanner.nextInt();
        System.out.print("Insira o segundo número: ");
        b = scanner.nextDouble();

        soma = a + b;
        subtracao = a - b;
        mult = a * b;
        div = a / b;
        raiz = Math.sqrt(a + b);

        System.out.println("Segue abaixo as operações matemáticas.");
        System.out.printf("\nA soma entre %.0f e %.0f é igual à %.0f.", a, b, soma);
        System.out.printf("\nA subtração entre %.0f e %.0f é igual à %.0f.", a, b, subtracao);
        System.out.printf("\nA multiplicação entre %.0f e %.0f é igual à %.0f.", a, b, mult);
        System.out.printf("\nA divisão entre %.1f e %.1f é igual à %.2f.", a, b, div);
        System.out.printf("\nA raiz entre %.2f e %.2f é igual à %.2f.", a, b, raiz);
    }
}