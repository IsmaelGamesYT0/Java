package LearnJava.evolution;
import java.util.Locale;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        float celsius, conversao;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.printf(Locale.US, "Exemplo: %.1f\n", 37.5f);

        System.out.print("Insira a temperatura em Celsius: ");
        celsius = sc.nextFloat();

        conversao = (celsius * 1.8f) + 32;

        System.out.printf(Locale.US,"A temperatura de %.1f°C equivale a %.2f°F.\n", celsius, conversao);
    }
}