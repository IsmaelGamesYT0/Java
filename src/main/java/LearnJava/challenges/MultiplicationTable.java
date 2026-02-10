package LearnJava.challenges;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira um número: ");
        n = scanner.nextInt();

        for(int t = 0; t <= 10; t++){
            System.out.println(n + " x " + t + " = " + n * t );
        }
        scanner.close();

        // Terminado em Estimativa de 32min\
    }
}