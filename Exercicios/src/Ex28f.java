//Exibir a soma dos números inteiros positivos do intervalo de um a cem.

public class Ex28f {
    public static void main(String[] args) {
        System.out.println("Soma dos números inteiros no intervalo de 1 a 100:");
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " + " + soma + " = ");
            soma += i;
            System.out.println(soma);
        }
    }
}
