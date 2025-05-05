package com.shieldteq.algorithm.part1.hashtable;

import lombok.Getter;

import java.util.*;

@Getter
public class HashTable {
    public static class Node {
        String key;
        int value;
        Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final Node[] dataMap = new Node[7];


    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            if (dataMap[i] != null) {
                Node temp = dataMap[i];
                while (temp != null) {
                    System.out.println("   {" + temp.key + ", " + temp.value + "}");
                    temp = temp.next;
                }
            }
        }
    }

    private int hash(String key) {
        int hash = 0;
        for (char c : key.toCharArray()) {
            hash = hash + (c * 23);
        }
        return hash % dataMap.length;
    }

    public void set(String key, int value) {
        int i = hash(key);
        Node newNode = new Node(key, value);
        Node existing = dataMap[i];
        if (existing == null) {
            dataMap[i] = newNode;
        } else {
            while (existing.next != null) {
                existing = existing.next;
            }
            existing.next = newNode;
        }
    }

    public int get(String key) {
        int i = hash(key);
        Node node = dataMap[i];
        while (node != null) {
            if (Objects.equals(node.key, key)) return node.value;
            node = node.next;
        }
        return 0;
    }


    public ArrayList<String> keys() {
        ArrayList<String> keys = new ArrayList<>();
        for (Node node : dataMap) {
            while (node != null) {
                keys.add(node.key);
                node = node.next;
            }
        }
        return keys;
    }


    public static List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }

    public static Character firstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : chars) {
            if (map.get(c) == 1) return c;
        }

        return null;

    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String str : strings) {
            char[] key = str.toCharArray();
            Arrays.sort(key);
            String keyStr = new String(key);
            List<String> value = anagrams.getOrDefault(keyStr, new ArrayList<>());
            value.add(str);
            anagrams.put(keyStr, value);
        }
        return new ArrayList<>(anagrams.values());
    }

    public static int[] twoSum(int[] nums, int sum) {
        // expectValue, index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = sum - nums[i];
            Integer index = map.get(nums[i]);
            if (index != null) return new int[]{index, i};
            map.put(diff, i);
        }
        return new int[0];
    }

    public static int[] subarraySum(int[] nums, int target) {
        Map<Integer, Integer> sumIndex = new HashMap<>();
        sumIndex.put(0, -1);
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            int diff = currentSum - target;
            Integer index = sumIndex.get(diff);
            if (index != null) {
                return new int[]{index + 1, i};
            }
            sumIndex.put(currentSum, i);
        }

        return new int[]{};
    }

    public static int longestConsecutiveSequence(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

}
