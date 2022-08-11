public class Solution6 {

    public static int lengthOfLongestSubstring(String s) {
        String subStr = "";
        String ajutine = "";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                subStr = s.substring(0,i);
            }
            else {
                ajutine = subStr;
            }

            if (i == s.length()-1){
                subStr = s.substring(ajutine.length(), i);
            }

        }
        System.out.println("vastus: " + subStr);
        return subStr.length();
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }
}
