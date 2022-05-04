//  Entrar via teclado com um valor qualquer. Travar a digitação, no sentido de
//  aceitar somente valores positivos. Após a digitação, exibir a tabuada do valor
//  solicitado, no intervalo de um a dez.

import java.util.Scanner;

public class Ex25w {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 1;
        int result;

        System.out.println("Insira um número positivo e descubra sua tabuada:");
        int tabu = sc.nextInt();
        while(tabu <= 0) {
            System.out.println("Valor negativo, tente novamente:");
            tabu = sc.nextInt();
        }
        while (count <= 10) {
            result = tabu * count;
            System.out.println(tabu + " x " + count + " = " + result);
            count++;
        }
    }
}
