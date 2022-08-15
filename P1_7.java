public class P1_7 {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println(findSum(n));
    }

    private static int findSum(int n) {
        int sum = 0;

        for (int i = 2; i <= n; i += 2) {
            sum += (i-1)*i;
        }

        return sum;
    }
}
