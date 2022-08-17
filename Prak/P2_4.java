package Prak;

import java.util.Arrays;
import java.util.Random;

public class P2_4 {

    private static void printElements(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " " + arr[arr.length - 1 - i]);
        }
    }

    private static void printSingleElements(int[] arr) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int el = arr[i];
            int k = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && el == arr[j])
                    k++;
            }
            if (k == 0)
                System.out.println(el);
        }
    }

    private static void findElSum(int[] arr1, int[] arr2) {
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int l = Math.min(arr1.length, arr2.length);
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < Math.max(arr1.length, arr2.length); j++) {
                if (arr2[i] == arr1[j])
                    System.out.println("Here");
            }
        }
    }

    private static boolean isUnique(int[] arr, int x) {
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (k > 1)
                return false;
            if (x == arr[i])
                k++;
        }
        if (k == 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Random rd = new Random(); // creating Random object
        int[] arr = new int[6];
        int[] arr2 = new int[4];
        for (int i = 0; i < arr.length; i++) {
            int rand = (int) (Math.random() * 13);
            arr[i] = rand; // storing random integers in an array
        }
        for (int i = 0; i < arr2.length; i++) {
            int rand = (int) (Math.random() * 7);
            arr2[i] = rand; // storing random integers in an array
        }
        System.out.println(Arrays.toString(arr));
        printUnique(arr);
    }

    private static void printUnique(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (isUnique(a,a[i]))
                System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
