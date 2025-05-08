package com.shieldteq.algorithm.part2;

import java.util.Map;

public class ExamplesUtil {
    /**
     * 371. Sum of Two Integers
     * Solved
     * Medium
     * Topics
     * Companies
     * Given two integers a and b, return the sum of the two integers without using the operators + and -.
     * Example 1:
     * Input: a = 1, b = 2
     * Output: 3
     * Example 2:
     * Input: a = 2, b = 3
     * Output: 5
     *
     * @param a int
     * @param b int
     * @return int
     */
    public int getSum(int a, int b) {
        int carry = 0;
        while (b != 0) {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    /**
     * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
     * For example:
     * A -> 1
     * B -> 2
     * C -> 3
     * ...
     * Z -> 26
     * AA -> 27
     * AB -> 28
     * ...
     * Example 1:
     * Input: columnTitle = "A"
     * Output: 1
     * Example 2:
     * Input: columnTitle = "AB"
     * Output: 28
     * Example 3:
     * Input: columnTitle = "ZY"
     * Output: 701
     *
     * @param columnTitle
     * @return
     */
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (char c : columnTitle.toCharArray()) {
            sum = (sum * 26) + (c - 'A' + 1);
        }
        return sum;
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }


    private static final Map<Character, Integer> map = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int sum = map.get(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            int prev = map.get(chars[i - 1]);
            int current = map.get(chars[i]);
            if (current > prev) {
                sum = sum + current - (2 * prev);
            } else {
                sum = sum + current;
            }
        }
        return sum;
    }

    public static int maxProfit(int[] prices) {
        // 7, 1, 5, 3, 6, 4
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit = maxProfit + prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
    public int firstUniqChar(String s) {
        char[] chars = new char[26];
        for(int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)-'a']++;
        }
        for(int i = 0; i < s.length(); i++) {
            if(chars[s.charAt(i)-'a']==1) return i;
        }
        return -1;

    }
}
