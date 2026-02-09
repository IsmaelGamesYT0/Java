package LearnJava.challenges;
import java.util.Scanner;

public class CarRentalCalc {
    public static void main(String[] args) {
        double km_rodados, dias_alugados, pagamento;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantos dias foram alugados: ");
        dias_alugados = scanner.nextDouble();

        System.out.println("Informe quantos KM foram rodados: ");
        km_rodados = scanner.nextDouble();

        pagamento = (dias_alugados * 60) + (km_rodados * 0.15);

        System.out.printf("Você alugou por %.2f dias.\n", dias_alugados);
        System.out.printf("E rodou %.2fkm.\n", km_rodados);
        System.out.printf("Você terá que pagar %,.2f", pagamento);

        // Finalizado em 07m 16s
    }
}
