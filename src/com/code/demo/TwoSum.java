package com.code.demo;

import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer> ();

        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(target - nums[i])){
                return new int[] {mp.get(target - nums[i]), i};
            } else {
                mp.put(nums[i], i);
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum calTwoSum = new TwoSum();
        int[] nums = {2, 3, 7, 29, 8};
        int target = 9;
        calTwoSum.twoSum(nums, target);
    }
}
