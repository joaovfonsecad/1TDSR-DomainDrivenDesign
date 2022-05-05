/*
Calcular e exibir a área de um retângulo, a partir dos valores da base
e altura que serão digitados. Se a área for maior que 100, exibir a mensagem
“Terreno grande”, caso contrário, exibir a mensagem “Terreno pequeno”.
 */

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular a area de um retangulo em metros.");
        System.out.print("Insira o valor da base: ");
        double base = sc.nextDouble();
        System.out.print("Insira o valor da altura: ");
        double altura = sc.nextDouble();

        double area = (base * altura);

        System.out.println("Area = " + String.format("%.2f", area) + "m²");

        if (area > 100) {
            System.out.println("Terreno grande.");
        }
        else {
            System.out.println("Terreno pequeno.");
        }
    }
}
