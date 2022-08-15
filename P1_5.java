public class P1_5 {
    public static void printRectangle(int size) {
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size - 1) System.out.println("#".repeat(size));
            else System.out.println("#" + " ".repeat(size - 2) + "#");
        }
    }

    public static void printSideWays(int size) {
        for (int i = 0; i < size; i++) {
            if (i == 0) System.out.println("#".repeat(size));
            else if (i == size - 1) System.out.println(" ".repeat(i) + "#".repeat(size));
            else System.out.println(" ".repeat(i) + "#" + " ".repeat(size - 2) + "#");
        }
    }

    public static void printByLarging(int size) {
        String text = "#";
        int counter = size * (size + 1) / 2;
        for (int i = 1; i <= size; i++) {
            counter -= i;
            System.out.println(" ".repeat(counter) + text.repeat(i));
        }
    }

    public static void printBridge(int size) {
        String text = "#";
        int counter = 0;
        int empty = 0;
        for (int i = 1; i <= size - counter; counter++, empty +=i, i++) {
            if (i == 1)
                System.out.println(text.repeat(size));
            else {
                System.out.println("#".repeat(size-i) + " ".repeat(empty) + "#".repeat(size - i));
            }
        }
    }

    public static void main(String[] args) {
        printBridge(5);
    }
}
