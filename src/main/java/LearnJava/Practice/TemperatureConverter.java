package LearnJava.Practice;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] ignoredArgs) {
        double C;
        double conversao_fahrenheit;
        double conversao_kelvin;
        double conversao_reaumur;
        double conversao_rankine;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor insira a temperatura em Celsius Exemplo: 37,4 ");
        C = scanner.nextDouble();

        conversao_fahrenheit = C * 1.8 + 32;
        conversao_kelvin = C + 273.15;
        conversao_reaumur = C * 0.8;
        conversao_rankine = C * 1.8 + 32 + 459.67;

        System.out.println("Segue a conversão logo abaixo: ");
        System.out.printf("Sua conversão de Celsius para Fahrenheit é: %.2f°F \n", conversao_fahrenheit);
        System.out.printf("Sua conversão de Celsius para Kelvin é: %.2f°K \n", conversao_kelvin);
        System.out.printf("Sua conversão de Celsius para Réaumur é: %.2f°Re\n", conversao_reaumur);
        System.out.printf("Sua conversão de Celsius para Rankine é: %.2f°Ra \n", conversao_rankine);

        scanner.close();
    }
}