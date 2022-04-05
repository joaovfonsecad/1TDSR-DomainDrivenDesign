import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b, h;
        System.out.println("base: ");
        b = sc.nextDouble();
        System.out.println("altura: ");
        h = sc.nextDouble();
        double area = (b * h) / 2;
        System.out.println((int)area);
    }
}
