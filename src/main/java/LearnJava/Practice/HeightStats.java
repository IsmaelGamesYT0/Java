package LearnJava.Practice;
import java.util.Scanner;

public class HeightStats {
    public static void main() {
        double altura1, altura2, altura3, altura4, altura5, altura6, altura7, altura8, altura9, altura10;
        double media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exemplo: 1,80");
        System.out.println("Informe a altura 1: ");
        altura1 = scanner.nextDouble();
        double maior = altura1;
        double menor = altura1;

        System.out.println("Informe a altura 2: ");
        altura2 = scanner.nextDouble();

        if (altura2 > maior) {
            maior = altura2;
        }

        if (altura2 < menor) {
            menor = altura2;
        }

        System.out.print("Informe a altura 3: ");
        altura3 = scanner.nextDouble();

        if (altura3 > maior) {
            maior = altura3;
        }

        if (altura3 < menor) {
            menor = altura3;
        }

        System.out.println("Informe a altura 4: ");
        altura4 = scanner.nextDouble();

        if (altura4 > maior) {
            maior = altura4;
        }

        if (altura4 < menor) {
            menor = altura4;
        }

        System.out.println("Informe a altura 5: ");
        altura5 = scanner.nextDouble();

        if (altura5 > maior) {
            maior = altura5;
        }

        if (altura5 < menor) {
            menor = altura5;
        }

        System.out.println("Informe a altura 6: ");
        altura6 = scanner.nextDouble();

        if (altura6 > maior) {
            maior = altura6;
        }

        if (altura6 < menor) {
            menor = altura6;
        }

        System.out.println("Informe a altura 7: ");
        altura7 = scanner.nextDouble();

        if (altura7 > maior) {
            maior = altura7;
        }

        if (altura7 < menor) {
            menor = altura7;
        }

        System.out.println("Informe a altura 8: ");
        altura8 = scanner.nextDouble();

        if (altura8 > maior) {
            maior = altura8;
        }

        if (altura8 < menor) {
            menor = altura8;
        }

        System.out.println("Informe a altura 9: ");
        altura9 = scanner.nextDouble();

        if (altura9 > maior) {
            maior = altura9;
        }

        if (altura9 < menor) {
            menor = altura9;
        }

        System.out.println("Informe a altura 10: ");
        altura10 = scanner.nextDouble();

        if (altura10 > maior) {
            maior = altura10;
        }

        if (altura10 < menor) {
            menor = altura10;
        }

        media = (altura1 + altura2 + altura3 + altura4 + altura5 +
                altura6 + altura7 + altura8 + altura9 + altura10) / 10;

        System.out.printf("A maior altura é de %.2fcm\n", maior);
        System.out.printf("A menor altura é de %.2fcm\n", menor);
        System.out.printf("A média de altura é de %.2fcm", media);

        scanner.close();
    }
}