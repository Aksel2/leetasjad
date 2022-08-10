class Solution {

    public static int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1 && calValue(s.charAt(i)) < calValue(s.charAt(i + 1))) {
                sum += calValue(s.charAt(i + 1)) - calValue(s.charAt(i));
                i++;
            } else sum += calValue(s.charAt(i));

        }

        return sum;
    }

    private static int calValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

}