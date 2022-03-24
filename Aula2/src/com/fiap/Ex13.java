/*
Entrar via teclado com três valores distintos. Exibir o maior deles.
 */

package com.fiap;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] n = new double[3];
        double maior = 0;

        System.out.println("Vamos encontrar o maior dos 3 numeros: ");
        System.out.print("Valor 1: ");
        n[0] = sc.nextDouble();
        System.out.print("Valor 2: ");
        n[1] = sc.nextDouble();
        System.out.print("Valor 3: ");
        n[2] = sc.nextDouble();

        for (int i = 0; i < 3; i++) {
            if (n[i] > maior) {
                maior = n[i];
            }
        }

        for (int i = 0; i < 3; i++) {
            if (n[i] == maior) {
                System.out.println("Valor " + (i + 1) + " (" + n[i] + ") é o maior.");
            }
        }
    }
}
