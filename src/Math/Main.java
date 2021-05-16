package Math;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = -13;
        double result = pow(a, b);
        double random = Math.random();
        System.out.println(result);
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(Math.sqrt(a));
        System.out.println(Math.abs(c));
        System.out.println(Math.max(b, c));
        System.out.println(a + b + random);
    }
}
