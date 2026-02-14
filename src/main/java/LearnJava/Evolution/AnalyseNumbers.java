package LearnJava.Evolution;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnalyseNumbers {
    public static void main(String[] args) {
        int contador = 0, positivo = 0, negativo = 0;
        int soma = 0;
        List<Integer> num = new ArrayList<>();
        Scanner scanner =  new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.println("Insira o número: ");
            num.add(scanner.nextInt());
            contador++;
            soma = soma + num.get(i);

            if(num.get(i) % 2 == 0) {
                System.out.printf("%d é par!\n", num.get(i));
            }else {
                System.out.printf("%d é ímpar!\n", num.get(i));
            }
            if(num.get(i) > 0) {
                positivo++;
            }
            else if(num.get(i) < 0){
                negativo++;
            }
        }
        System.out.printf("Você inseriu %d números.\n", contador);
        System.out.printf("Você inseriu %d números positivos.\n", positivo);
        System.out.printf("Você inseriu %d números negativos.\n", negativo);
        System.out.printf("A soma de todos é igual a %d", soma);
    }
}