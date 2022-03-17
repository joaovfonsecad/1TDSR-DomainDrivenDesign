package com.fiap;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quant = 5;
        double[] prods = new double[quant];
        double soma = 0;

        for (int i = 0; i < quant; i++) {
            System.out.print("Produto " + (i + 1) + ": \n R$ ");
            prods[i] = sc.nextDouble();
            System.out.print("");
            soma += prods[i];
        }
        System.out.println("Valor recebido: ");
        double recebido = sc.nextDouble();

        double troco = recebido - soma;
        if (troco < 0) {
            System.out.println("Valor inferior ao total a ser pago.");
        }
        else {
            System.out.println("Troco: \n R$" + String.format("%.2f", troco));
        }
    }
}
