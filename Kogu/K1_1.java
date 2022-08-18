package Kogu;

public class K1_1 {
    public static void main(String[] args) {
        System.out.println(findInt());
    }

    private static int findInt() {
        int x = 2;
        while (true) {
            int square = (int) Math.pow(x, 2);
            int cube = 0;
            String abi = x + "";
            for (int i = 0; i < abi.length(); i++) {
                cube += Integer.parseInt(abi.charAt(i) + "");
            }
            if ((int) Math.pow(cube, 3) == square) {
                break;
            }
            x++;
        }

        return x;
    }
}
