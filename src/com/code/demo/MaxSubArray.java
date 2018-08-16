package com.code.demo;

public class MaxSubArray {

    public static void main(String args[]) {

        MaxSubArray sol = new MaxSubArray();
        int ans = sol.maxSubArray2(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(ans);

    }

    int maxSubArray(int[] nums) {

        int res = Integer.MIN_VALUE;
        int[] f = new int[nums.length];
        f[0] = nums[0];
        for (int i = 1; i < f.length; i++) {
            if (f[i - 1] > 0) {
                f[i] = f[i - 1] + nums[i];
            }
            else {
                f[i] = nums[i];
            }
            System.out.println(f[i]);

        }

        for (int i = 0; i < f.length; i++) {
            res = Math.max(res, f[i]);
        }


        return res;
    }

    int maxSubArray2(int[] nums) {
        int res = nums[0];
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i] + sum, nums[i]);
            res = Math.max(sum, res);
        }

        return res;
    }
}
