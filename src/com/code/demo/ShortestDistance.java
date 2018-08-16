package com.code.demo;

public class ShortestDistance {
    public int FindShortestDistance(String[] words, String word1, String word2) {

        if (words == null) {
            return -1;
        }
        int res = words.length;
        int indexA = -1;
        int indexB = -1;

        for (int i = 0; i < words.length; i++) {

            if (words[i].equals(word1)) {
                indexA = i;
            }

            if (words[i].equals(word2)) {
                indexB = i;
            }

            if (indexA != -1 && indexB != -1) {
                res = Math.min(Math.abs(indexA - indexB), res);
            }

        }

        return res;
    }

    public static void main(String[] args) {
        ShortestDistance sol = new ShortestDistance();
        String[] words = new String[]{"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";

        System.out.println(sol.FindShortestDistance(words, word1, word2));
    }
}
