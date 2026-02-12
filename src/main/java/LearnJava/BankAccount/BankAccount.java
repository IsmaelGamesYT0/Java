package LearnJava.BankAccount;

public class BankAccount {
    private double saldo;

    public void Depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!\n");
    }
    public void Sacar(double valor) {
        if (saldo >= valor) {
           saldo -= valor;
           System.out.println("Saque realizado com sucesso!\n");
        }
        else {
            System.out.println("Saldo Insuficiente. Refaça a operação!");
        }
    }
    public double ConsultarSaldo() {
        return saldo;
    }
    public void ExibirSaldo() {
        System.out.printf("\nSeu novo saldo é R$%.2f", this.ConsultarSaldo());
    }
}