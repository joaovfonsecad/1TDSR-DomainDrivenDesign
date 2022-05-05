//Exibir os vinte primeiros valores da série de Bergamaschi. A série: 1, 1, 1, 3, 5, 9, 17, ...

public class Ex30f {
    public static void main(String[] args) {
        int bergaA = 1;
        int bergaB = 1;
        int bergaC = 1;
        int bergaD;
        System.out.print(bergaA + ", " + bergaB + ", " + bergaC);
        for (int i = 0; i < 20; i++) {
            bergaD = bergaA + bergaB + bergaC;
            System.out.print(", " + bergaD);
            bergaA = bergaB;
            bergaB = bergaC;
            bergaC = bergaD;
        }
    }
}
