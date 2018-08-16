package com.code.demo;

import java.util.*;

public class PermutePalindrome {
    public boolean canPermutePalindrome(String s) {
        if (s.length() <= 1){
            return true;
        }
        //boolean res = false;
        int flag = 0;
        HashSet<Character> hs = new HashSet<Character>();

        for (Character ch : s.toCharArray()) {
            if (hs.contains(ch)) {
                hs.remove(ch);
            }
            else {
                hs.add(ch);
            }
        }

        return hs.size() <= 1;
    }

    public static void main(String[] args) {
        PermutePalindrome sol = new PermutePalindrome();
        String s= "sdfsadfddde";
        System.out.println(sol.canPermutePalindrome(s));
    }
}
