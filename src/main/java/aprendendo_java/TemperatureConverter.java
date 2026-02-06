package aprendendo_java;

/*
Enunciado:

Crie um programa que receba uma temperatura em graus Celsius (C)
e a converta para as seguintes escalas:

- Fahrenheit (F): F = C * 1.8 + 32
- Kelvin (K):      K = C + 273.15
- Réaumur (Re):    Re = C * 0.8
- Rankine (Ra):    Ra = C * 1.8 + 32 + 459.67

O programa deve exibir o valor convertido em cada escala.
*/

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] ignoredArgs) {
        Double C;
        Double conversao_fahrenheit;
        Double conversao_kelvin;
        Double conversao_reaumur;
        Double conversao_rankine;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor insira a temperatura em Celsius Exemplo: 37,4 ");
        C = scanner.nextDouble();

        conversao_fahrenheit = C * 1.8 + 32;
        conversao_kelvin = C + 273.15;
        conversao_reaumur = C * 0.8;
        conversao_rankine = C * 1.8 + 32 + 459.67;

        System.out.println("Segue a conversão logo abaixo: ");

        System.out.printf("Sua conversão de Celsius para Fahrenheit é: %.2f°F \n", conversao_fahrenheit);
        System.out.printf("Sua conversão de Celsius para Kelvin é: %.2f°K \n", conversao_kelvin);
        System.out.printf("Sua conversão de Celsius para Réaumur é: %.2f°Re\n", conversao_reaumur);
        System.out.printf("Sua conversão de Celsius para Rankine é: %.2f°Ra \n", conversao_rankine);

        scanner.close();
    }
}
