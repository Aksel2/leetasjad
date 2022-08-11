public class P1_5 {
    public static void printRectangle(int size) {
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1)
                System.out.println("#".repeat(size));
            else
                System.out.println("#" + " ".repeat(size - 2) + "#");
        }
    }

    public static void printSideWays(int size) {
        for (int i = 0; i < size; i++) {
            if (i == 0)
                System.out.println("#".repeat(size));
            else if (i == size - 1)
                System.out.println(" ".repeat(i) + "#".repeat(size));
            else
                System.out.println(" ".repeat(i) + "#" + " ".repeat(size - 2) + "#");
        }
    }

    public static void printByLarging(int size) {
        for (int i = 0; i < size; i++) {
            if (i == 0)
                System.out.println("#");
            else {
                System.out.println(" ".repeat(i) + "#".repeat(i+1));
            }
        }
    }

    public static void main(String[] args) {
        printByLarging(5);
    }
}
