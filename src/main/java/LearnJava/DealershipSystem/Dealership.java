package LearnJava.DealershipSystem;
import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);
        Car carro1 = new Car();
        Car carro2 = new Car();

        carro1.modelo = "Nissan 370z";
        carro1.ano = 2008;
        carro1.cor = "Verde";

        carro2.modelo = "Supra MK4";
        carro2.ano = 1993;
        carro2.cor = "Laranja";

        System.out.println("Olá, Seja Bem-vindo à minha concessionária!");
        System.out.println("Escolha abaixo qual carro gostaria de ver.");
        System.out.println("[1] - Nissan 370z" + "\n[2] - Supra MK4");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1: {
               carro1.ExibirFichaTecnica();
                break;
            }
            case 2: {
                carro2.ExibirFichaTecnica();
                break;
            }
            default: {
                System.out.println("\nOpção inválida!");
                break;
            }
        }
    }
}