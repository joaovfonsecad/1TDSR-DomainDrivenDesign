//  Exibir a tabuada do número cinco no intervalo de um a dez.

public class Ex24d {
    public static void main(String[] args) {
        int tabu = 5;
        int cont = 1;
        int result;
        do {
            result = tabu * cont;
            System.out.println("5 x " + (cont) + " = " + result);
            cont++;
        }
        while (cont <= 10);
    }
}
