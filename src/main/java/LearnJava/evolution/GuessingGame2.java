package LearnJava.evolution;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int numerosecreto = random.nextInt(1, 100);
        int palpite = 0;
        int tentativas = 0;

        while(palpite != numerosecreto) {
            System.out.println("Digite o número: ");
            palpite = sc.nextInt();
            tentativas++;
            if (palpite > numerosecreto) {
                System.out.println(" número digitado é maior");
            }
            else if(palpite < numerosecreto) {
                System.out.println("O número digitado é menor");
            }
        }
        System.out.printf("O número secreto era %d \n", numerosecreto);
        System.out.printf("Você tentou %d vezes", tentativas);
    }
}