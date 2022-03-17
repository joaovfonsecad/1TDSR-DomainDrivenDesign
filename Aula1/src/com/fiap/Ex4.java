package com.fiap;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quant = 4;
        double[] a = new double[quant];
        double soma = 0;
        for (int i = 0; i < quant; i++) {
            System.out.println("Valor " + (i + 1) + ": ");
            a[i] = sc.nextDouble();
            soma += a[i];
        }
        double media = soma / quant;
        System.out.println("Média = " + String.format("%.2f", media));
    }
}
