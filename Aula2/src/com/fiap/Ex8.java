/*
Entrar via teclado, com dois valores distintos. Exibir o maior deles.
 */

package com.fiap;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro valor: ");
        double a = sc.nextDouble();
        System.out.println("Segundo valor: ");
        double b = sc.nextDouble();

        if (a > b) {
            System.out.println("O primeiro valor (" + a + ") é o maior.");
        }
        else if (a == b) {
            System.out.println("Os dois valores são iguais");
        }
        else {
            System.out.println("O segundo valor (" + b + ") é o maior.");
        }
    }
}
