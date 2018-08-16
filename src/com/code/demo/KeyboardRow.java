package com.code.demo;

import java.security.Key;
import java.util.HashMap;

public class KeyboardRow {

    public String[] findWords(String[] words){
        String[] res = words;
        return res;
    }

    public static void main(String[] args){
        KeyboardRow kb = new KeyboardRow();
        String[] input = {"Hello", "Alaska", "Dad", "Peace"};
        String[] ans = kb.findWords(input);
        //ans = kb.findWords(input);
        for (String x : input)
              {
            System.out.println(x);
        }
    }
}
