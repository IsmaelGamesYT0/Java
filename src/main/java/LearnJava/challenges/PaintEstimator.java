package LearnJava.challenges;
import java.util.Scanner;

public class PaintEstimator {
    public static void main(String[] args) {

        int largura, altura, area;
        double rendimento = 10;
        int demos = 2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor insira a largura da parede: ");
        largura = scanner.nextInt();

        System.out.println("Por favor, insira a altura da parede: ");
        altura = scanner.nextInt();

        area = largura * altura;
        double litro_tinta = (area * demos) / rendimento;

        System.out.printf("Será preciso %.2f litros de tintas para pintar a parede.", litro_tinta);

        // Finalizado em 03m 12s
    }
}