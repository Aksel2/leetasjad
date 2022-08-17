package Medium;

import java.util.Arrays;

public class Solution62 {
    public static int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        System.out.println(Arrays.deepToString(grid));
        // grid[m - 1][n - 1]
        /*
        grid[0][0]
        [][]
        [][]
        [][]
         */

        return 0;
    }

    public static void main(String[] args) {
        int m = 3, n = 2;
        System.out.println(uniquePaths(m, n));
    }
}
