package com.fiap;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor da cotação do dólar: ");
        double cota = sc.nextDouble();
        System.out.println("Quantia de dólares a ser convertida: ");
        double dolls = sc.nextDouble();
        double reais = dolls * cota;
        System.out.println("US$ " + dolls + " = R$ " + String.format("%.2f", reais));
    }
}
