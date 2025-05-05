package com.shieldteq.algorithm.part1.array;

import com.shieldteq.algorithm.part1.array.ArraysExample;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ArraysExampleTest {

    @Test
    public void arraysTwoSum() {
        ArraysExample ae = new ArraysExample();
        int[] nums = new int[]{2, 2, 7, 11, 15};
        System.out.println(Arrays.toString(ae.twoSum(nums, 9)));
    }

    @Test
    public void moveZerosTest() {
        ArraysExample ae = new ArraysExample();
//        int[] nums = new int[]{0, 0, 1};
//        int[] nums = new int[]{0,1,0,3,12};
        int[] nums = new int[]{1, 0, 1, 0, 3, 0, 12, 0};
        ae.moveZeroesOptimal(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void rotateTest() {
        ArraysExample ae = new ArraysExample();
//        int[] nums = new int[]{0, 0, 1};
//        int[] nums = new int[]{0,1,0,3,12};
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        ae.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void maxSum() {
        ArraysExample ae = new ArraysExample();
//        int[] nums = new int[]{0, 0, 1};
//        int[] nums = new int[]{0,1,0,3,12};
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(ae.maxSubArray(nums));
    }

    @Test
    public void prefixSuffixProduct() {
        ArraysExample ae = new ArraysExample();
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(ae.productExceptSelf(nums)));
    }


    @Test
    public void maximumProductSubArrayTest() {
        ArraysExample ae = new ArraysExample();
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(ae.maximumProductSubArray(nums));
    }

}
