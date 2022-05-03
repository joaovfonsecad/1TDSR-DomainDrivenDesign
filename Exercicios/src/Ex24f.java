//  Exibir a tabuada do número cinco no intervalo de um a dez.

public class Ex24f {
    public static void main(String[] args) {
        int tabu = 5;
        int result;
        for (int i = 1; i <= 10; i++) {
            result = tabu * i;
            System.out.println("5 x " + (i) + " = " + result);
        }
    }
}
