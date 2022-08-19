package Kogu;

public class K1_5 {

    private static int findGreatest(int n) {
        int max = 0;
        for (int k = 0; (int) Math.pow(2, k) <= n; k++)
            if (n % (int) Math.pow(2, k) == 0)
                max = k;
        return max;
    }

    public static void main(String[] args) {
        int n = 2000;
        System.out.println(findGreatest(n));
    }
}
