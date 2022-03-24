/*
Entrar com o peso e a altura de uma determinada pessoa.
Após a digitação, exibir se esta pessoa está ou não com seu
peso ideal. Fórmula: peso/altura².
 */

package com.fiap;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular o imc.");
        System.out.print("Peso(kg): ");
        double peso = sc.nextDouble();
        System.out.print("Altura(cm): ");
        double altura = (sc.nextDouble() / 100);

        double imc = peso / (altura * altura);

        System.out.println("IMC = " + imc);

        if (imc > 18.5 && imc < 24.9) {
            System.out.println("Parabéns, você está dentro de seu peso ideal.");
        }
        else if (imc > 24.9){
            System.out.println("Sinto muito você está comendo demais.");
        }
        else {
            System.out.println("Sinto muito, você precisa comer mais.");
        }
    }
}
