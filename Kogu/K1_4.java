package Kogu;

public class K1_4 {

    public static void main(String[] args) {
        int n = 1908;
        System.out.println("k = " + findLeastK(n));
    }

    private static int reverseInt(int pow) {
        int reverse = 0;
        int num = pow;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }

    private static int findLeastK(int n) {
        int sum = 0;
        for (int k = 0; k < Integer.MAX_VALUE; k++) {
            sum = n * (int) Math.pow(3, k);
            if (sum >= 100 && getThirdDigit(sum))
                return k;
        }
        return -1;
    }


    private static boolean getThirdDigit(int sum) {
        int x = (reverseInt(sum) / 100) % 10;
        return x == 0;
    }
}
