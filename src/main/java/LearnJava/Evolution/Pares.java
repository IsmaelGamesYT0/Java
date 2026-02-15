package LearnJava.Evolution;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        String[] pr = {
            "primeiro",
            "segundo",
            "terceiro",
            "quarto",
            "quinto",
            "sexto",
            "sétimo",
            "oitavo",
            "nono",
            "décimo",
        };
        List<Integer> num = new ArrayList<>();
        int n;
        Scanner scanner =  new Scanner(System.in);

        for (int i = 0; i <10; i++) {
            System.out.printf("Insira o %s número: \n", pr[i]);
            n = scanner.nextInt();
            num.add(n);
        }
        for (int i = 0; i < 10; i++) {
            if(num.get(i) % 2 == 0) {
                System.out.printf("%d é par!\n", num.get(i));
        }else {
                System.out.printf("%d é ímpar!\n", num.get(i));
            }
        }
        scanner.close();
    }
}