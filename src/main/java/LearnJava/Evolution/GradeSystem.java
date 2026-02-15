package LearnJava.Evolution;
import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        float nt1, nt2, nt3, media;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        nt1 = scanner.nextFloat();

        System.out.print("Informe a segunda nota: ");
        nt2 = scanner.nextFloat();

        System.out.print("Informe a terceira nota: ");
        nt3 = scanner.nextFloat();

        media = (nt1 + nt2 + nt3) / 3;

        if (media >= 7.0) {
            System.out.println("\nAprovado!");
        }
        else if (media >= 5 && media < 7) {
            System.out.println("\nEm recuperação.");
        }
        else {
            System.out.println("\nReprovado!");
        }
        scanner.close();
    }
}