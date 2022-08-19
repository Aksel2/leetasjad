package Kogu;

import java.util.Arrays;

public class K1_6 {


    public static void main(String[] args) {
        int x = 325, y = 444, z = 229;
        //  minMax(x, y, z);
        sortedList(x, y, z);

    }

    private static void closestArit(int x, int y, int z) {
        int aritMed = (x + y + z) / 3;
        int abi = 0;
        int max = Math.max(Math.max(x, y), z);
        int min = Math.min(Math.min(x, y), z);
        int med = x + y + z - (max + min);

        System.out.println(aritMed);
    }

    private static int[] sortedList(int x, int y, int z) {
        int[] sorted = new int[3];
        int max = Math.max(Math.max(x, y), z);
        int min = Math.min(Math.min(x, y), z);
        int med = x + y + z - (max + min);
        for (int i = 0; i < sorted.length; i++) {
            if (i == 0)
                sorted[i] = min;
            else if (i == 1)
                sorted[i] = med;
            else sorted[i] = max;
        }
        System.out.println(Arrays.toString(sorted));
        return sorted;
    }

    private static void med(int x, int y, int z) {
        int max = Math.max(Math.max(x, y), z);
        int min = Math.min(Math.min(x, y), z);
        int med = x + y + z - (max + min);
        System.out.println("Keskmine = " + med);

    }

    private static void minMax(int x, int y, int z) {
        int max = Math.max(Math.max(x, y), z);
        int min = Math.min(Math.min(x, y), z);
        System.out.println("Suurim = " + max);
        System.out.println("Vähim = " + min);
    }
}
