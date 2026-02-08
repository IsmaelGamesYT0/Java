package LearnJava.challenges;
import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {

        float nota1, nota2, nota3, media;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a primeira nota: Exemplo: 8,2 \n");
        nota1 = scanner.nextFloat();

        System.out.print("Insira a segunda nota: \n");
        nota2 = scanner.nextFloat();

        System.out.print("Insira a terceira nota: \n");
        nota3 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média é %.2f.", media);

        // Finalizado em 02m 14s
    }
}
