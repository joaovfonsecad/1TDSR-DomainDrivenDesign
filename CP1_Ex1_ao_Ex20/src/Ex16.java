/*
Verificar se três valores quaisquer (A, B, C) que serão digitados
formam ou não um triângulo retângulo. Lembre-se que o quadrado da hipotenusa
é igual a soma dos quadrados dos catetos.
 */

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] n = new double[3];
        double maior = 0;
        int hipotenusa = 0;
        double[] cateto = new double[2];
        double somaCatetosQuadrado = 0;

        boolean isTriangulo = false;
        boolean isEquilatero = false;

        System.out.println("Vamos calcular se é um triangulo, e depois se ele é triangulo retangulo.");
        System.out.print("a: ");
        n[0] = sc.nextDouble();
        System.out.print("b: ");
        n[1] = sc.nextDouble();
        System.out.print("c: ");
        n[2] = sc.nextDouble();

        if ((n[0] + n[1]) > n[2] && (n[1] + n[2]) > n[0] && (n[0] + n[2]) > n[1]) {
            isTriangulo = true;
        }
        else {
            System.out.println("Não é triangulo.");
        }

        if(isTriangulo) {
            if (n[0] == n[1] && n[1] == n[2]) {
                System.out.println("Não é triangulo retangulo.");
                isEquilatero = true;
            }
            if (!isEquilatero) {
                for (int i = 0; i < 3; i++) {
                    if (n[i] > maior) {
                        maior = n[i];
                    }
                }

                for (int i = 0; i < 3; i++) {
                    if (n[i] == maior) {
                        hipotenusa = i;
                        break;
                    }
                }

                for (int i = 0; i < 3; i++) {
                    if (i != hipotenusa) {
                        somaCatetosQuadrado += (n[i] * n[i]);
//                        System.out.println(somaCatetosQuadrado);
                    }
                }
//                System.out.println(n[hipotenusa] * n[hipotenusa]);
                if ((n[hipotenusa] * n[hipotenusa]) == somaCatetosQuadrado) {
                    System.out.println("É retangulo.");
                }
                else {
                    System.out.println("Não é retangulo.");
                }
            }
        }
    }
}
