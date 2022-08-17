package Prak;

public class P2_2 {


    public static void main(String[] args) {
        int a = 1071, b = 462;
        System.out.println(Subgcd(a, b));
        System.out.println(gcd(a, b));
        System.out.println(ModGcd(a, b));
    }

    private static int ModGcd(int a, int b) {
        System.out.println(a + " " + b);
        if (b == 0)
            return a;
        else
            return ModGcd(b, a % b);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            System.out.println(a + " " + b);
            int r = a - b * (a / b);
            a = b;
            b = r;
        }
        return a;
    }

    private static int Subgcd(int a, int b) {
        while (a != b) {
            System.out.println(a + " " + b);
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

}
