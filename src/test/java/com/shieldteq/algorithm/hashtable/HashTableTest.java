package com.shieldteq.algorithm.hashtable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.shieldteq.algorithm.hashtable.HashTable.*;

class HashTableTest {

    @Test
    public void hashTableTest() {
        HashTable myHashTable = new HashTable();

        myHashTable.printTable();
    }

    @Test
    public void setTest() {
        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        myHashTable.printTable();
    }

    @Test
    public void getTest() {
        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        Assertions.assertEquals(100, myHashTable.get("nails"));
        Assertions.assertEquals(80, myHashTable.get("lumber"));
    }

    @Test
    public void getKeysTest() {
        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        System.out.println(myHashTable.keys());
    }

    @Test
    public void findDuplicateTest() {
        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);
    }

    @Test
    public void firstNonRepeatingCharTest() {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
    }

    @Test
    public void groupAnagramsTest() {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));
    }

    @Test
    public void twoSumTest() {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));
    }

    @Test
    public void subarraySumTest() {
        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 9;
        int[] result1 = subarraySum(nums1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {-1, 2, 3, -4, 5};
        int target2 = 0;
        int[] result2 = subarraySum(nums2, target2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {2, 3, 4, 5, 6};
        int target3 = 3;
        int[] result3 = subarraySum(nums3, target3);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");

        int[] nums4 = {};
        int target4 = 0;
        int[] result4 = subarraySum(nums4, target4);
        System.out.println(result4.length);

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 3]
            [0, 3]
            [1, 1]
            []

         */
    }

    @Test
    public void longestConsecutiveSequenceTest() {
        testLongestConsecutiveSequence("Consecutive Integers", new int[]{1, 2, 3, 4, 5}, 5);
        testLongestConsecutiveSequence("No Sequence", new int[]{1, 3, 5, 7, 9}, 1);
        testLongestConsecutiveSequence("Duplicates", new int[]{1, 2, 2, 3, 4}, 4);
        testLongestConsecutiveSequence("Negative Numbers", new int[]{1, 0, -1, -2, -3}, 5);
        testLongestConsecutiveSequence("Empty Array", new int[]{}, 0);
        testLongestConsecutiveSequence("Multiple Sequences", new int[]{1, 2, 3, 10, 11, 12, 13}, 4);
        testLongestConsecutiveSequence("Unordered Elements", new int[]{5, 1, 3, 4, 2}, 5);
        testLongestConsecutiveSequence("Single Element", new int[]{1}, 1);
        testLongestConsecutiveSequence("All Identical Elements", new int[]{2, 2, 2, 2, 2}, 1);
    }

    private static void testLongestConsecutiveSequence(String title, int[] nums, int expected) {
        System.out.println("Test: " + title);
        System.out.print("Testing array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int result = longestConsecutiveSequence(nums);
        System.out.println("Expected longest streak: " + expected);
        System.out.println("Actual longest streak: " + result);

        if (result == expected) {
            System.out.println("PASS\n");
        } else {
            System.out.println("FAIL\n");
        }
    }
}
