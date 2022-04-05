import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        System.out.println("aresta: ");
        a = sc.nextDouble();
        double area = a * a;
        System.out.println("area = " + (int)area);
    }
}
