package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution804 {

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...",
                "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> w = new HashSet<>();
        for (String word : words) {
            StringBuilder m = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                m.append(morse[word.charAt(j) - 'a' + 1 - 1]);
            }
            w.add(m.toString());
        }
        return w.size();
    }

    public static void main(String[] args) {

        String[] words = {"gin", "zen", "gig", "msg"};
        //System.out.println(words[0].charAt(0) - 'a' + 1);

        System.out.println(uniqueMorseRepresentations(words));
    }
}
