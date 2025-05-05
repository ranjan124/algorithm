package com.shieldteq.algorithm.part2.binary;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTest {
    /**
     * Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has
     *
     * @param n
     * @return
     */
    public int numberOfOneBits(int n) {
        // write your code here

        int count = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) count++;
            mask = mask << 1;
        }
        return count;
    }

    /**
     * Given an integer n, return an array ans of length n+1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i. Without using any builtin functions.
     * Example 1:
     * Input: n = 2
     * Output: [0,1,1]
     * Explanation:
     * 0 --> 0
     * 1 --> 1
     * 2 --> 10
     * Example 2:
     * Input: n = 5
     * Output: [0,1,1,2,1,2]
     * Explanation:
     * 0 --> 0
     * 1 --> 1
     * 2 --> 10
     * 3 --> 11
     * 4 --> 100
     * 5 --> 101
     * Constraints:
     * 0 <= n <= 105
     *
     * @param n int
     * @return int[]
     */
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        int offset = 1;
        result[0] = 0;
        for (int i = 1; i <= n; i++) {
            if (offset * 2 == i) offset = i;

            result[i] = 1 + result[i - offset];
        }

        return result;
    }

    /**
     * Practice - Missing Number
     * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
     * Example 1:
     * Input: nums = [3, 0, 1]
     * Output: 2
     * Example 2:
     * Input: nums = [0, 1]
     * Output: 2
     * Example 3:
     * Input: nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
     * Output: 8
     *
     * @param arr int[]
     * @return int
     */
    public int findMissingNumber(int[] arr) {
        int missing = arr.length;
        for (int i = 0; i < arr.length; i++) {
            missing = missing ^ arr[i] ^ i;
        }
        return missing;
    }

    /**
     * Practice - Reverse Bits
     * Reverse the bits of a given 32-bit unsigned integer. Input and output are signed integers. Input is a 32-bit binary string.
     * Example 1:
     * Input: 00000010100101000001111010011100
     * Output: 964176192 (00111001011110000010100101000000)
     * Example 2:
     * Input: 11111111111111111111111111111101
     * Output: 3221225471 (10111111111111111111111111111111)
     *
     * @param n int
     * @return int
     */
    public int reverseBits(int n) {
        int reversed = 0;
        for (int i = 0; i < 32; i++) {
            reversed = reversed << 1;
            reversed = reversed + (n & 1);
            n = n >> 1;
        }
        return reversed;
    }
}
