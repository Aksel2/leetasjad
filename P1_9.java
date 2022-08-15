public class P1_9 {

    static double findPi(int reps) {
        int inCircle = 0;
        for (int i = 0; i < reps; i++) {
            double x = Math.random();
            double y = Math.random();
            // a**2 + b**2 = c**2
            if (x * x + y * y <= 1) // (x - a)**2 - (y - b)**2 = r**2
                inCircle++;
        }

        return 4 * ((double) inCircle / (double) reps);
    }

    public static void main(String[] args) {

    }
}
