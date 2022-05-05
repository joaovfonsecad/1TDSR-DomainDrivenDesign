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
