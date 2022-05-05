import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[10];

        for (int i = 0; i < 10; i++) {
            Produto p = new Produto();
            p.id = (i + 1);

            System.out.println("Descrição do produto:");
            p.descricao = sc.nextLine();

            System.out.println("Quantidade:");
            p.quantidade = sc.nextDouble();

            System.out.println("Valor:");
            p.valor = sc.nextDouble();

            produtos[i] = p;
            sc.nextLine();
            System.out.println("-------------");
        }

        for (int i = 0; i < 10; i++) {
            if (produtos[i].valor < 100) {
                System.out.println((i + 1) + "º: " + produtos[i].descricao + "\nvalor: " + produtos[i].valor + "\nquantidade: " + produtos[i].quantidade);
            }
        }
    }
}
