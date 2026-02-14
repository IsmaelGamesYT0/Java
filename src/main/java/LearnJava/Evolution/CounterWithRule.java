package LearnJava.Evolution;
import java.util.Scanner;

public class CounterWithRule {
    public static void main(String[] args) {
        int num = 1;
        int contador = 0, positivo = 0, negativo = 0;
        Scanner scanner = new Scanner(System.in);

        while(num != 0) {
            System.out.println("Insira o número: ");
            num = scanner.nextInt();
            contador++;

            if(num > 0) {
                positivo++;
            }
            else if(num < 0){
                negativo++;
            }
        }
        System.out.printf("Você inseriu %d números.\n", contador);
        System.out.printf("Você inseriu %d números positivos.\n", positivo);
        System.out.printf("Você inseriu %d números negativos.\n", negativo);
    }
}