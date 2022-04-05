import java.util.Scanner;

public class Ex21w {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor positivo!");
        double valor = sc.nextDouble();
        int tentativas = 0;
        boolean positivo = false;

        while(valor < 0 && tentativas < 3) {
            tentativas++;
            System.out.println(tentativas);
            if (tentativas == 3) {
                break;
            }
            else {
            System.out.println("Valor invalido, tente novamente:");
            valor = sc.nextDouble();
            }
        }

        if (tentativas != 3) {
            positivo = true;
        }

        if (positivo) {
            System.out.println("Parabens, seu valor é positivo!");
        }
        else {
            System.out.println("Número de tentivas esgotado. Programa Terminado.");
        }
    }
}
