package com.shieldteq.algorithm.part2.string;

public class StringUtil {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int num: nums) {
            result = result ^ num;
        }
        return result;
    }
}
