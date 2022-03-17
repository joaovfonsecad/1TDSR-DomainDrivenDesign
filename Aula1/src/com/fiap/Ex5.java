package com.fiap;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperatura em graus celsius: ");
        double celsius = sc.nextDouble();

        double faren = (celsius * 9 / 5) + 32;
        System.out.println("temperatura em fahrenheit = " + faren);
    }
}
