package com.code.demo;

public class Interleave {

    public boolean isInterleave(String s1, String s2, String s3) {
        //DP problem.
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        boolean[][] dp = new boolean[s2.length() + 1][s1.length() + 1];
        dp[0][0] = true;

        // compare s1 from 1 to s1.length - 1 combine empty string s2 with s3:
        for (int i = 1; i < dp[0].length; i++) {
            dp[0][i] = dp[0][i - 1] && (s3.charAt(i - 1) == s1.charAt(i - 1));
        }
        // for debugging
        System.out.println("dp[0].length is :" + dp[0].length);
        System.out.println("dp[0][i] is :");
        for (int i = 0; i < dp[0].length; i++) {
            System.out.println(dp[0][i]);
        }

        // compare s2 from 1 to s2.length - 1 combine empty string s1 with s3:
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = dp[i - 1][0] && (s3.charAt(i - 1) == s2.charAt(i - 1));
        }

        // for debugging
        System.out.println("dp.length is :" + dp.length);

        System.out.println("dp[i][0]'s is :");
        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i][0]);
        }

        for (int i = 1; i < dp.length; i++) { //row
            for (int j = 1; j < dp[0].length; j++) { // col
                dp[i][j] = (dp[i - 1][j] && (s3.charAt(i + j - 1) == s2.charAt(i - 1)))
                        || (dp[i][j - 1] && (s3.charAt(i + j - 1) == s1.charAt(j - 1)));
            }
        }

        System.out.println(dp.length);
        System.out.println(dp[0].length);
        System.out.println(s2.length());
        System.out.println(s1.length());

                return dp[dp.length - 1][dp[0].length - 1];
//        return dp[s2.length()][s1.length()];

    }

    public static void main(String[] args) {
        Interleave sol = new Interleave();
        String s1 = "";
        String s2 = "b";
        String s3 = "b";

        Boolean res = sol.isInterleave(s1, s2, s3);

        System.out.println("the res is " + res);
    }
}
