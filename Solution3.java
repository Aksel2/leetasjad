import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution3 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int[] ints = new int[3];
            System.out.println(Arrays.toString(ints));
        }

        return a;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}