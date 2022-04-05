//  Entrar com dois valores via teclado, onde o segundo deverá ser maior que o primeiro.
//  Caso contrário solicitar novamente apenas o segundo valor.

import java.util.Scanner;

public class Ex22d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro valor: ");
        double a = sc.nextDouble();
        double b;

        do {
            System.out.println("Segundo valor: ");
            b = sc.nextDouble();
        }
        while (a > b);

        if (b == a) {
            System.out.println("Números iguais.");
        }
        else {
            System.out.println("O segundo é maior que o primeiro.");
        }
    }
}
