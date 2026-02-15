package LearnJava.Challenges;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2, soma, subt, mult, div, pot, raiz;
        int opcao;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        num1 = scanner.nextDouble();

        System.out.println("Insira o segundo número: ");
        num2 = scanner.nextDouble();

        soma = num1 + num2;
        subt = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        pot = Math.pow(num1, num2);
        raiz = Math.sqrt(num1 + num2);

        System.out.println("Por favor escolha uma operação: ");
        System.out.println("[1] - Soma");
        System.out.println("[2] - Subtração");
        System.out.println("[3] - Multiplicação");
        System.out.println("[4] - Divisão");
        System.out.println("[5] - Potênciação");
        System.out.println("[6] - Raiz");
        System.out.println("[7] - Sair");
        opcao = scanner.nextInt();

        switch(opcao) {
            case 1:{
                System.out.printf("A soma entre %.2f e %.2f é igual à %.2f.", num1, num2, soma);
                break;
            }
            case 2:{
                System.out.printf("A subtração entre %.2f e %.2f é igual à %.2f.", num1, num2, subt);
                break;
            }
            case 3:{
                System.out.printf("A multiplicação entre %.2f e %.2f é igual à %f.", num1, num2, mult);
                break;
            }
            case 4:{
                System.out.printf("A divisão entre %.2f e %.2f é igual à %.2f.", num1, num2, div);
                break;
            }
            case 5:{
                System.out.printf("A potênciação entre %.2f e %.2f é igual à %,.2f.", num1, num2, pot);
                break;
            }
            case 6:{
                System.out.printf("A raiz entre %.2f e %f é igual à %.2f.", num1, num2, raiz);
                break;
            }
            case 7:{
                System.out.println("Saindo...");
                break;
            }
        }
        scanner.close();
    }
}
