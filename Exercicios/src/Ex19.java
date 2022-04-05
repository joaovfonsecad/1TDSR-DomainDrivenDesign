/*
Uma escola com cursos em regime semestral, realiza duas avaliações durante o
semestre e calcula a média do aluno, da seguinte maneira:

MEDIA = (P1 + 2P2) / 3

Fazer um programa para entrar via teclado com os valores das notas (P1 e P2)
e calcular a média. Exibir a situação final do aluno (“Aprovado ou Reprovado”), sabendo
que a média de aprovação é igual a cinco.

 */

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("P1: ");
        double p1 = sc.nextDouble();
        System.out.print("P2: ");
        double p2 = sc.nextDouble();

        double media = (p1 + (2 * p2)) / 3;

        System.out.println("Média = " + String.format("%.1f", media));
    }
}
