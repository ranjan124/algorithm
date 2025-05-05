package com.shieldteq.algorithm.part1.heap;

import java.util.ArrayList;
import java.util.List;

public class HeapUsage {
    public static List<Integer> streamMax(int[] nums) {
        Heap heap = new Heap();
        List<Integer> max = new ArrayList<>();
        for(int num: nums) {
            heap.insert(num);
            max.add(heap.getHeap().getFirst());
        }
        return max;
    }

    public static int findKthSmallest(int[] nums, int k) {
        Heap maxHeap = new Heap();

        for (int num : nums) {
            maxHeap.insert(num);
            if (maxHeap.getHeap().size() > k) {
                maxHeap.remove();
            }
        }

        return maxHeap.remove();
    }

}
