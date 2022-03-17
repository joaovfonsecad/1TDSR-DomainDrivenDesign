package com.fiap;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        System.out.println("base: ");
        a = sc.nextDouble();
        System.out.println("altura: ");
        b = sc.nextDouble();
        double area = a * b;
        System.out.println((int)area);
    }
}
