//  Exibir a tabuada do número cinco no intervalo de um a dez.

public class Ex24w {
    public static void main(String[] args) {
        int tabu = 5;
        int cont = 1;
        int result;
        while (cont <= 10) {
            result = tabu * cont;
            System.out.println("5 x " + (cont) + " = " + result);
            cont++;
        }
    }
}
