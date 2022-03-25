/*
A partir de três valores que serão digitados, verificar se formam
ou não um triângulo. Em caso positivo, exibir sua classificação: “Isósceles,
escaleno ou eqüilátero”. Um triângulo escaleno possui todos os lados diferentes,
o isósceles, dois lados iguais e o eqüilátero, todos os lados iguais. Para existir
triângulo é necessário que a soma de dois lados quaisquer seja maior que o outro,
isto, para os três lados.
 */

package com.fiap;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isTriangulo = false;

        System.out.println("Vamos calcular se é um triangulo, e depois qual seu tipo.");
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            isTriangulo = true;
        }
        else {
            System.out.println("Não é triangulo.");
        }

        if(isTriangulo) {
            if (a == b && a == c) {
                System.out.println("Triangulo equilatero.");
            }
            else if (a == b && a != c) {
                System.out.println("Triangulo isóceles.");
            }
            else {
                System.out.println("Triangulo escaleno.");
            }
        }
    }
}
