package LearnJava.BankAccount;
import java.util.Locale;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) throws InterruptedException {
        Locale.setDefault(Locale.US);
        int opcao;
        double deposit, sacar;
        Scanner option = new Scanner(System.in);
        Scanner deposito = new Scanner(System.in);
        Scanner saque = new Scanner(System.in);
        BankAccount conta1 = new BankAccount();

        do {
            System.out.println("\nOlá, Seja bem-vindo ao Inova Bank");
            System.out.println("Qual ação você gostaria de realizar?");
            System.out.println("[1] - Depositar" + " [2] - Sacar " +
                    " [3] - Consultar Saldo"  + " [4] - Sair");
            opcao = option.nextInt();

            if(opcao == 1) {
                System.out.println("\nQuanto você gostaria de depositar?");
                deposit = deposito.nextDouble();
                conta1.Depositar(deposit);
            }
            else if(opcao == 2) {
                System.out.println("\nQuanto você gostaria de sacar?");
                sacar = saque.nextDouble();
                conta1.Sacar(sacar);
            }
            else if(opcao == 3) {
                conta1.ExibirSaldo();
            }
            else if(opcao < 1 || opcao > 4) {
                System.out.println("\nOpção inválida, tente novamente!");
            }
            else{
                System.out.print("\nSaindo...");
                System.out.print("3...");
                Thread.sleep(1000);
                System.out.print("2...");
                Thread.sleep(1000);
                System.out.println("1...");
                Thread.sleep(1000);
                System.out.println("Obrigado!");
            }
        } while (opcao != 4);
    }
}
