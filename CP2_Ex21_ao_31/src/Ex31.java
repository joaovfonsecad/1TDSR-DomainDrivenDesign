//Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo.
//O valor “N” será digitado, deverá ser positivo, mas menor que cem. Caso o valor não satisfaça
//a restrição, enviar mensagem de erro e solicitar o valor novamente.
//A seqüência: 2, 5, 10, 17, 26, ....

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um n positivo menor que 100:");
        int n = sc.nextInt();
        while (n < 0 || n > 100) {
            if (n < 0) {
                System.out.println("Valor negativo, tente novamente: ");
            }
            else {
                System.out.println("Valor maior que 100, tente novamente: ");
            }
            n = sc.nextInt();
        }

        int count = 1;
        int seq = 5;
        System.out.print("2");
        for (int i = 5; count < n; i += 2) {
            System.out.print(", " + seq);
            seq += i;
            count++;
        }
    }
}
