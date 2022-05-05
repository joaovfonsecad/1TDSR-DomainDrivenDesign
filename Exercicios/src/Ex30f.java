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
