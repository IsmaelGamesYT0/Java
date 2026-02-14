package LearnJava.Evolution;
import java.util.Locale;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        float celsius, fahrenheit;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Exemplo: 38.5\n");
        System.out.print("Informa a temperatura em Celsius: ");
        celsius = scanner.nextFloat();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf(Locale.US,"\nA temperatura de %.1f°C em Fahrenheit é %.1f°F.\n", celsius, fahrenheit);
    }
}