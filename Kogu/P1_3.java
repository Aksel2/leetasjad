package Kogu;

public class P1_3 {

    public static void main(String[] args) {
        findPlaindrome();
    }

    private static void findPlaindrome() {
        for (int i = 100; i <= 999; i++) {
            if ((int) Math.pow(i, 2) == reverseInt((int) Math.pow(i, 2)))
                System.out.println(i);
        }
    }

    private static int reverseInt(int pow) {
        int reverse = 0;
        int num = pow;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        /*
        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
    }
         */
        return reverse;
    }
}
