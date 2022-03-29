/*
A partir dos valores da aceleração (a em m/s2), da velocidade inicial (v0 em m/s) e do tempo de percurso
(t em s). Calcular e exibir a velocidade final de automóvel em km/h. Exibir mensagem de acordo com a
tabela:

Fórmula para o cálculo da velocidade em m/s: V = v0 + a. t
 */

package com.fiap;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("aceleração(m/s2): ");
        double acel = sc.nextDouble();
        System.out.print("velocidade inicial(m/s):");
        double velo = sc.nextDouble();
        System.out.print("tempo do percurso:");
        double tempo = sc.nextDouble();

        double veloFinal = velo + (acel * tempo);
        double veloFInalKMS = veloFinal * 3.6;
        System.out.println("Velocidade final: " + String.format("%.2f", veloFInalKMS) + "Km/h");
    }
}
