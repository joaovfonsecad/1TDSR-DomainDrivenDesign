/*
Entrar via teclado, com dois valores distintos. Exibir o menor deles.
 */

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro valor: ");
        double a = sc.nextDouble();
        System.out.println("Segundo valor: ");
        double b = sc.nextDouble();

        if (a < b) {
            System.out.println("O primeiro valor (" + a + ") é o menor.");
        }
        else if (a == b) {
            System.out.println("Os dois valores são iguais");
        }
        else {
            System.out.println("O segundo valor (" + b + ") é o menor.");
        }
    }
}
