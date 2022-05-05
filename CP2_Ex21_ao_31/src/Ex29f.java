//Exibir os trinta primeiros valores da série de Fibonacci. A série: 1, 1, 2, 3, 5, 8, ...

public class Ex29f {
    public static void main(String[] args) {
        int fiboAnt = 0;
        int fiboProx = 1;
        int fiboSoma;
        System.out.print(fiboProx);
        for (int i = 0; i < 30; i++) {
            fiboSoma = fiboAnt + fiboProx;
            System.out.print(", " + fiboSoma);
            fiboAnt = fiboProx;
            fiboProx = fiboSoma;
        }
    }
}
