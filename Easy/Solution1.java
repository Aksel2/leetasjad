package Easy;

public class Solution1 {

        public static boolean isPalindrome(int x) {
        String j = x + "";
        for (int i = 0; i < j.length(); i++) {
            if (j.charAt(i) != j.charAt(j.length() - i - 1))
                return false;
            if (i / 2 == (j.length() - 1) / 2)
                break;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(16461));
    }
}
