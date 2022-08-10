import java.util.Arrays;
import java.util.Comparator;

class Solution2 {
    public static String longestCommonPrefix(String[] strs) {
        String commonStr = "";
        Arrays.sort(strs, Comparator.comparingInt(String::length));

        for (int i = 0; i < strs[0].length(); i++) {
            int x = 1;
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) == strs[j].charAt(i))
                    x++;
            }
            if (x == strs.length)
                commonStr += strs[0].charAt(i);
            else break;
        }

        return commonStr;
    }

    public static void main(String[] args) {
        String[] words = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(words));
    }
}