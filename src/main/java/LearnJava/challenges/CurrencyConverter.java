package LearnJava.challenges;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        double saldo, dolar;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor insira seu saldo: Exemplo: 8,90");
        saldo = scanner.nextFloat();

        dolar = (saldo / 5.22);

        System.out.printf("Seu saldo de R$%.2f reais convertido é igual à $%.2f dólares.", saldo, dolar);

        // Finalizado em 04m 12s
    }
}