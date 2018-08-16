package com.code.demo;

import java.util.ArrayList;
import java.util.List;

public class Rotate {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int step = k % len;

        reverse(nums, 0, len - k - 1);
        reverse(nums, len - k, len - 1);
        reverse(nums, 0, len - 1);


    }

    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Rotate sol = new Rotate();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        sol.rotate(nums, 3);

        for (int num: nums) {
            System.out.println(num);
        }

    }
}
