/*
Uma escola com cursos em regime semestral realiza duas avaliações durante o semestre
e calcula a média do aluno, da seguinte maneira:

MEDIA = (P1 + 2P2) / 3

Fazer um programa para entrar via teclado com o valor da primeira nota (P1) e o programa
deverá calcular e exibir quanto o aluno precisa tirar na segunda nota (P2) para ser aprovado,
sabendo que a média de aprovação é igual a cinco.

 */

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("P1: ");
        double p1 = sc.nextDouble();

        double p2 = (15 - p1) / 2;

        System.out.println("Você precisa tirar: " + String.format("%.1f", p2) + " na p2.");
    }
}
