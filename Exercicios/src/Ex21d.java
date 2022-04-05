import java.util.Scanner;

public class Ex21d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        int tentativas = 0;
        boolean positivo = false;

        do {
            System.out.println("Insira um valor positivo!");
            valor = sc.nextDouble();
            if (valor < 0){
                tentativas++;
//                System.out.println(tentativas);
            }
            else {
                break;
            }
        }
        while(tentativas < 3);

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
