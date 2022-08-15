public class P1_8 {
    public static void main(String[] args) {
        calculateSum();
    }

    private static void calculateSum() {
        int sum = 0;

        for (int i = 102, j = 2; j < i; i -= 4, j += 4) {
            sum += (j * i);
        }
        System.out.println(sum);
    }
}
