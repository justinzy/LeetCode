package com.code.demo;

import  java.util.*;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == "" || s == null){
            return 0;
        }
        int pointer = 0;
        int res = 0;
        int[] lst = new int[6];
        System.out.println(lst.length);
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (mp.containsKey(s.charAt(i))) {
                pointer = Integer.max(pointer, mp.get(s.charAt(i))+1);
            }

            res = Integer.max(res, i - pointer + 1);
            mp.put(s.charAt(i), i);

        }

        return res;
    }

    public static void main(String[] args) {
        LongestSubstring sol = new LongestSubstring();
        System.out.println(sol.lengthOfLongestSubstring("pwwkew"));

    }
}
