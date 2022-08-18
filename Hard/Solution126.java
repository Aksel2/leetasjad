package Hard;

import java.util.List;

public class Solution126 {

    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {


        return null;
    }

    public static void main(String[] args) {
        String beginWord = "hit", endWord = "cog";
        List<String> wordList = List.of(new String[]{"hot", "dot", "dog", "lot", "log", "cog"});

        System.out.println(findLadders(beginWord, endWord, wordList));
    }
}
