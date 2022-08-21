package Hard;

public class Solution871 {
    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        if (target - startFuel <= 0)
            return 0;
        else if (target - startFuel > 0 && stations.length == 0)
            return -1;

        for (int i = 0; i < 1; i++) {

        }

        return 1;
    }

    public static void main(String[] args) {
        int[][] stations = {{10, 60}, {20, 30}, {30, 30}, {60, 40}};
        int target = 100, startFuel = 10;
        System.out.println(minRefuelStops(target, startFuel, stations));
    }
}
