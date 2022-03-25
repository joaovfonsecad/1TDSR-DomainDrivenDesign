/*
Entrar com o peso, o sexo e a altura de uma determinada pessoa.
Após a digitação, exibir se esta pessoa
está ou não com seu peso ideal. Fórmula: peso/altura².

 */

package com.fiap;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular o imc.");
        System.out.print("Peso(kg): ");
        double peso = sc.nextDouble();
        System.out.print("Altura(cm): ");
        double altura = (sc.nextDouble() / 100);
        System.out.println("Sexo(f ou m): ");
        char sexo = sc.next().charAt(0);

        double imc = peso / (altura * altura);

        System.out.println("IMC = " + imc);

        if(sexo == 'f') {
            if (imc >= 19 && imc < 24)
                System.out.println("Parabéns, você está dentro de seu peso ideal.");
            else if (imc >= 24)
                System.out.println("Sinto muito você está comendo demais.");
            else
                System.out.println("Sinto muito, você precisa comer mais.");
        }
        else if(sexo == 'm') {
            if (imc >= 20 && imc < 25)
                System.out.println("Parabéns, você está dentro de seu peso ideal.");
            else if (imc >= 25)
                System.out.println("Sinto muito você está comendo demais.");
            else
                System.out.println("Sinto muito, você precisa comer mais.");
        }
        else
            System.out.println("Sexo invalido");
    }
}
