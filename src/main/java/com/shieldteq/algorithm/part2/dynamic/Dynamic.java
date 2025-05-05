package com.shieldteq.algorithm.part2.dynamic;

public class Dynamic {
    /**
     * Practice - Climbing Stairs
     * You are climbing a staircase. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     * Example 1:
     * Input: n = 2
     * Output: 2
     * Example 2:
     * Input: n = 3
     * Output: 3
     * Explanation:
     * 1. 1 step + 1 step + 1 step
     * 2. 1 step + 2 steps
     * 3. 2 steps + 1 step
     *
     * @param n int
     * @return int TC: O(n), SC: O(n)
     */
    public int climbStairs1(int n) {
        if (n <= 2) return n;
        int[] series = new int[n + 1];
        series[1] = 1;
        series[2] = 2;

        for (int i = 3; i <= n; i++) {
            series[i] = series[i - 1] + series[i - 2];

        }
        return series[n];

    }

    /**
     * @param n int
     * @return int TC: O(n), SC: O(1)
     */
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int first = 1;
        int second = 2;
        for (int i = 0; i < n - 2; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }

    /**
     * Practice - Coin Change
     * Given an integer array coins[ ] of size N representing different denominations of currency and an integer amount, find the number of ways you can make amount by using different combinations from coins array.
     * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
     * You may assume that you have an infinite number of each kind of coin.
     * Example 1:
     * Input: coins = [1,2,5], amount = 11
     * Output: 3
     * Explanation: 11 = 5 + 5 + 1
     * Example 2:
     * Input: coins = [2], amount = 3
     * Output: -1
     *
     * @param coins  int[]
     * @param amount int
     * @return int
     */
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j] && dp[i - coins[j]] != -1) {
                    min = Math.min(min, dp[i - coins[j]]);
                }
            }
            dp[i] = (min == Integer.MAX_VALUE) ? -1 : 1 + min;
        }
        return dp[amount];
    }

    /**
     * Practice - Longest Increasing Subsequence
     * Given an array of integers nums, find the length of the longest (strictly) increasing subsequence from the given array.
     * Example 1:
     * Input: nums = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15}
     * Output:  6
     * Explanation: There are multiple LIS in this array of same length. One of the Longest increasing subsequence is {0,2,6,9,13,15}.
     * Example 2:
     * Input: nums = {5,8,3,7,9,1}
     * Output:  3
     * Explanation: One such Longest increasing subsequence is {5,7,9}.
     *
     * @param nums int[]
     * @return int
     */
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if (n == 1) return 1;
        int[] ss = new int[n];
        ss[0] = 1;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            int len = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    len = Math.max(len, ss[j]);
                }
            }
            ss[i] = len + 1;
            ans = Math.max(ans, ss[i]);
        }
        return ans;
    }

    /**
     * Practice - Longest Common Subsequence
     * Given two strings text1 and text2, return the length of  longest common subsequence. If there is no common subsequence, return 0.
     * A subsequence of a given sequence is a sequence that can be derived from the given sequence by deleting some or no elements without changing the order of the remaining elements.
     * For example, "ace" is a subsequence of "abcde".
     * A common subsequence of two strings is a subsequence that is common to both strings.
     * Example 1:
     * Input: text1 = "abcde", text2 = "ace"
     * Output: 3
     * Explanation: The longest common subsequence is "ace" and its length is 3.
     * Example 2:
     * Input: text1 = "abc", text2 = "abc"
     * Output: 3
     * Explanation: The longest common subsequence is "abc" and its length is 3.
     * Example 3:
     * Input: text1 = "abc", text2 = "def"
     * Output: 0
     * Explanation: There is no such common subsequence, so the result is 0.
     *
     * @param text1 String
     * @param text2 String
     * @return int
     */
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] cc = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 1; i < cc.length; i++) {
            for (int j = 1; j < cc[0].length; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    cc[i][j] = cc[i - 1][j - 1] + 1;
                } else {
                    cc[i][j] = Math.max(cc[i - 1][j], cc[i][j - 1]);
                }
            }
        }
        return cc[text1.length()][text2.length()];
    }
}
