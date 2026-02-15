package LearnJava.Practice;
import java.util.Scanner;

public class AnnualSchoolAverage {
    public static void main(String[] args) throws InterruptedException {

        // Declaração das variavéis.
        String nome;
        float nota1, nota2, nota3, nota4, media;
        Scanner sc = new Scanner(System.in);
        //+------------------------------------------------------------------------------------------------------+\\

        // Área do input.
        System.out.println("Olá, seja bem-vindo ao meu programa que calcula média anual escolar!");
        System.out.println("=====================================================================");

        System.out.print("Informe o nome completo do aluno: ");
        nome = sc.nextLine();
        System.out.println("=====================================================================");

        System.out.print("\nInsira a primeira nota: ");
        nota1 = sc.nextFloat();
        System.out.println("=====================================================================");

        System.out.print("\nInsira a segunda nota: ");
        nota2 = sc.nextFloat();
        System.out.println("=====================================================================");

        System.out.print("\nInsira a terceira nota: ");
        nota3 = sc.nextFloat();
        System.out.println("=====================================================================");

        System.out.print("\nInsira a quarta nota: ");
        nota4 = sc.nextFloat();
        System.out.println("=====================================================================");
        //+------------------------------------------------------------------------------------------------------+\\
        // Cálculo da média, verificação pra evitar média acima de 10 e output.
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media > 10) {
            System.out.println("Média inválida!");
            sc.close();
            return;
        }

        System.out.println("\nCalculando média anual...");
        Thread.sleep(2000);
        System.out.println("\nCálculo da média finalizado!");
        Thread.sleep(1000);

        if (media >= 6) {
            System.out.printf("\nParabéns [%s] você foi aprovado com média [%.1f]!", nome, media);
        }
        else if (media <= 5 && media > 3) {
            System.out.printf("\n[%s], você ficou de recuperação com média [%.1f]!", nome, media);
        }
        else if (media < 3) {
            System.out.printf("\n[%s], você foi reprovado com média [%.1f]!", nome, media);
        }
        sc.close();
        //+------------------------------------------------------------------------------------------------------+\\
    }
}