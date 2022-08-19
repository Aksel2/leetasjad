package Kogu;

public class K1_7 {

    public static void main(String[] args) {
        double p = 1.85;
        double k = 78;
        System.out.println(bmiGrade(calculateBmi(k, p)));

    }

    private static double calculateBmi(double kg, double m) {
        double bmi = (kg / (Math.pow(m, 2)));
        return Math.round(bmi);
    }

    private static int bmiGrade(double bmi) {
        if (bmi < 20)
            return -1;
        else if (20 <= bmi && bmi < 25) {
            return 0;
        } else if (25 <= bmi && bmi < 30) {
            return 1;
        } else if (30 <= bmi && bmi < 35) {
            return 2;
        }
        return 3;
    }

    private static boolean isNormalWeight(int p, int k) {
        int x = p - k;
        if (x <= 98) {
            System.out.println("Ülekaalus");
            return false;
        } else if (x > 102) {
            System.out.println("Alakaalus");
            return false;
        }
        System.out.println("Normkaalus");
        return true;
    }
}
