package LearnJava.evolution;
import java.util.Arrays;
import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        String[] numeros_nomes = {
                "primeiro",
                "segundo",
                "terceiro",
                "quarto",
                "quinto",
        };
        int[] lista = new int[5];
        int numero;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Por favor, digite %s número: ", numeros_nomes[i]);
            numero = scanner.nextInt();
            lista[i] = numero;
        }
        int resultado = Arrays.stream(lista).sum();

        System.out.printf("A soma de todos os números é igual a %d", resultado);
    }
}