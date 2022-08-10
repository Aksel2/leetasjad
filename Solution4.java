import java.util.Arrays;

class Solution4 {
    public static int[] twoSum(int[] nums, int target) {
        int[] targetNums = new int[2];
        boolean stop = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    targetNums[0] = i;
                    targetNums[1] = j;
                    stop = true;
                    break;
                }
            }
            if (stop)
                break;
        }

        return targetNums;
    }

    public static void main(String[] args) {
        int[] values = {2, 5, 5, 11};
        System.out.println(Arrays.toString(twoSum(values, 10)));

    }
}