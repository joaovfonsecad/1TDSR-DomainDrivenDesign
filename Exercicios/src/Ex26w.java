/* Entrar via teclado com um valor (X) qualquer. Travar a digitação, no sentido de aceitar
somente valores positivos. Solicitar o intervalo que o programa que deverá calcular a tabuada
do valor digitado, sendo que o segundo valor (B), deverá ser maior que o primeiro (A), caso
contrário, digitar novamente somente o segundo. Após a validação dos dados, exibir a tabuada
do valor digitado, no intervalo decrescente, ou seja, a tabuada de X no intervalo de B para A.
 */

import java.util.Scanner;

public class Ex26w {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;

        System.out.println("Insira um número positivo e descubra sua tabuada:");
        int xQualquer = sc.nextInt();
        while(xQualquer <= 0) {
            System.out.println("Valor negativo, tente novamente:");
            xQualquer = sc.nextInt();
        }
        System.out.println("Insira um intervalo maior que o valor digitado anteriormente:");
        int intervalo = sc.nextInt();
        while(intervalo <= xQualquer) {
            System.out.println("Intervalo menor que o valor anterior, tente novamente:");
            intervalo = sc.nextInt();
        }

        while (intervalo >= xQualquer) {
            result = xQualquer * intervalo;
            System.out.println(xQualquer + " x " + intervalo + " = " + result);
            intervalo--;
        }
    }
}
