package com.shieldteq.algorithm.array;

import java.util.HashMap;
import java.util.Map;

public class ArraysExample {
    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * <p>
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * <p>
     * You can return the answer in any order.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * Example 2:
     * <p>
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * Example 3:
     * <p>
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 2 <= nums.length <= 104
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     * Only one valid answer exists.
     *
     * @param nums   input array
     * @param target target value
     * @return array of indices
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> match = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            match.put(target - nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer exists = match.get(nums[i]);
            if (exists != i) {
                return new int[]{exists, i};
            }
        }

        return new int[0];
    }

    /**
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * <p>
     * Note that you must do this in-place without making a copy of the array.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     * Example 2:
     * <p>
     * Input: nums = [0]
     * Output: [0]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= nums.length <= 104
     * -231 <= nums[i] <= 231 - 1
     */
    public void moveZeroesOptimal(int[] nums) {
        int mid = 0;
        int low = 0;
        while (mid <= nums.length - 1) {
            if (nums[mid] != 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } else {
                mid++;
            }
        }

    }

    public void moveZeroes(int[] nums) {
        if (nums.length < 2) return;
        int lastIndex = nums.length - 1;
        while (nums[lastIndex] == 0) {
            lastIndex--;
        }
        for (int i = 0; i < lastIndex; i++) {
            if (nums[i] == 0) {
                shiftZeroToEnd(nums, i, lastIndex);
                lastIndex--;
                if (nums[0] == 0) i--;
            }
        }

    }

    public void shiftZeroToEnd(int[] nums, int si, int li) {
        for (int i = si; i < li; i++) {
            nums[i] = nums[i + 1];
        }
        nums[li] = 0;
    }

    /**
     * given 1, 2, 3, 4, 5, 6, 7 ... 3
     * output5, 6, 7, 1, 2, 3, 4
     * <p>
     * loop for first time
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] result = nums.clone();
        for (int i = 0; i < length; i++) {
            nums[(i + k) % length] = result[i];
        }
    }

    /**
     * Given an integer array nums, find the subarray with the largest sum, and return its sum.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
     * Example 2:
     * <p>
     * Input: nums = [1]
     * Output: 1
     * Explanation: The subarray [1] has the largest sum 1.
     * Example 3:
     * <p>
     * Input: nums = [5,4,-1,7,8]
     * Output: 23
     * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
     */

    public int maxSubArray(int[] nums) {
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        // 5,4,-1,7,8
        for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(maxCurrent, maxCurrent+nums[i]);
            maxGlobal = Math.max(maxCurrent, maxGlobal);
        }

        return maxGlobal;
    }
}
