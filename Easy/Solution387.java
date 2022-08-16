package Easy;

import java.util.HashMap;

public class Solution387 {

    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            String x = s.charAt(i) + "";
            if (s.indexOf(x) == s.lastIndexOf(x))
                return i;
        }
        return -1;
    }

    public static int hashFirstUniqChar(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hash.put(c, hash.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (hash.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "sdaghufdsaif";
        System.out.println(firstUniqChar(s));
        System.out.println(hashFirstUniqChar(s));
    }
}
