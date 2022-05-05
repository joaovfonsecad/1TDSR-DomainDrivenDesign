//Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez.
//Entre as tabuadas, solicitar que o usuário pressione uma tecla.

import java.util.Scanner;

public class Ex27f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;

        for (int i = 1; i <= 20; i++) {
            System.out.println("tabuada do número " + i + ": ");
            for (int j = 1; j <= 10; j++) {
                result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }
            System.out.print("para continuar aperte enter: ");
            sc.nextLine();
        }
    }
}
