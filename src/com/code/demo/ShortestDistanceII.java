package com.code.demo;

import java.util.*;

public class ShortestDistanceII {
    public String[] words;
    HashMap<String, List<Integer>> dict = new HashMap<>();
    public ShortestDistanceII(String[] words) {
        this.words = words;

        for (int i = 0; i < words.length; i++) {
            if (dict.containsKey(words[i])) {
                List<Integer> tmpList = dict.get(words[i]);
                tmpList.add(i);
                dict.put(words[i], tmpList);
            } else {
                List<Integer> tmpLst = new ArrayList<Integer>();
                tmpLst.add(i);
                dict.put(words[i], tmpLst);
            }
        }
    }

    public int shortest(String word1, String word2) {
        List<Integer> lstA = dict.get(word1);
        List<Integer> lstB = dict.get(word2);
        int i = 0;
        int j = 0;
        int res = words.length;

        while(i < lstA.size() && j < lstB.size()) {
            res = Math.min(Math.abs(lstA.get(i) - lstB.get(j)), res);

            if (lstA.get(i) < lstB.get(j)) {
                i++;
            } else {
                j++;
            }

        }
        return res;

    }

    public static void main(String[] args) {
        String[] words = new String[]{"practice", "makes", "perfect", "coding", "makes"};
        ShortestDistanceII obj = new ShortestDistanceII(words);
        String word1 = "makes";
        String word2 = "coding";
        int res = obj.shortest(word1, word2);
        System.out.println(res);
    }
}
