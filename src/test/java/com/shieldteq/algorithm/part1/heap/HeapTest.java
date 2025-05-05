package com.shieldteq.algorithm.part1.heap;

import com.shieldteq.algorithm.part1.heap.Heap;
import org.junit.jupiter.api.Test;

import static com.shieldteq.algorithm.part1.heap.HeapUsage.findKthSmallest;
import static com.shieldteq.algorithm.part1.heap.HeapUsage.streamMax;

class HeapTest {
    @Test
    public void heapTest() {
        Heap myHeap = new Heap();
        myHeap.init();
        myHeap.printHeap(0, 0);
    }

    @Test
    public void insertTest() {
        Heap myHeap = new Heap();
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);
        myHeap.printHeap(0, 0);
        myHeap.insert(100);
        myHeap.printHeap(0, 0);
        myHeap.insert(75);
        myHeap.printHeap(0, 0);

        /*
            EXPECTED OUTPUT:
            ----------------
            [99, 72, 61, 58]
            [100, 99, 61, 58, 72]
            [100, 99, 75, 58, 72, 61]

        */

    }

    @Test
    public void removeTest() {

        Heap myHeap = new Heap();
        myHeap.insert(95);
        myHeap.insert(75);
        myHeap.insert(80);
        myHeap.insert(55);
        myHeap.insert(60);
        myHeap.insert(50);
        myHeap.insert(65);

        myHeap.printHeap(0, 0);


        myHeap.remove();

        myHeap.printHeap(0, 0);


        myHeap.remove();

        myHeap.printHeap(0, 0);

        myHeap.remove();

        myHeap.printHeap(0, 0);

        /*
            EXPECTED OUTPUT:
            ----------------
            [95, 75, 80, 55, 60, 50, 65]
            [80, 75, 65, 55, 60, 50]
            [75, 60, 65, 55, 50]

        */

    }

    @Test
    public void findKthSmallestTest() {
        // Test case 1
        int[] nums1 = {7, 10, 4, 3, 20, 15};
        int k1 = 3;
        System.out.println("Test case 1:");
        System.out.println("Expected output: 7");
        System.out.println("Actual output: " + findKthSmallest(nums1, k1));
        System.out.println();

        // Test case 2
        int[] nums2 = {2, 1, 3, 5, 6, 4};
        int k2 = 2;
        System.out.println("Test case 2:");
        System.out.println("Expected output: 2");
        System.out.println("Actual output: " + findKthSmallest(nums2, k2));
        System.out.println();

        // Test case 3
        int[] nums3 = {9, 3, 2, 11, 7, 10, 4, 5};
        int k3 = 5;
        System.out.println("Test case 3:");
        System.out.println("Expected output: 7");
        System.out.println("Actual output: " + findKthSmallest(nums3, k3));
        System.out.println();


        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1:
            Expected output: 7
            Actual output: 7

         */
    }

    @Test
    public void streamMaxTest() {// Test case 1
        int[] nums1 = {1, 5, 2, 9, 3, 6, 8};
        System.out.println("Test case 1:");
        System.out.println("Input: [1, 5, 2, 9, 3, 6, 8]");
        System.out.println("Expected output: [1, 5, 5, 9, 9, 9, 9]");
        System.out.println("Actual output: " + streamMax(nums1));
        System.out.println();

        // Test case 2
        int[] nums2 = {10, 2, 5, 1, 0, 11, 6};
        System.out.println("Test case 2:");
        System.out.println("Input: [10, 2, 5, 1, 0, 11, 6]");
        System.out.println("Expected output: [10, 10, 10, 10, 10, 11, 11]");
        System.out.println("Actual output: " + streamMax(nums2));
        System.out.println();

        // Test case 3
        int[] nums3 = {3, 3, 3, 3, 3};
        System.out.println("Test case 3:");
        System.out.println("Input: [3, 3, 3, 3, 3]");
        System.out.println("Expected output: [3, 3, 3, 3, 3]");
        System.out.println("Actual output: " + streamMax(nums3));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1:
            Input: [1, 5, 2, 9, 3, 6, 8]
            Expected output: [1, 5, 5, 9, 9, 9, 9]
            Actual output: [1, 5, 5, 9, 9, 9, 9]

            Test case 2:
            Input: [10, 2, 5, 1, 0, 11, 6]
            Expected output: [10, 10, 10, 10, 10, 11, 11]
            Actual output: [10, 10, 10, 10, 10, 11, 11]

            Test case 3:
            Input: [3, 3, 3, 3, 3]
            Expected output: [3, 3, 3, 3, 3]
            Actual output: [3, 3, 3, 3, 3]

        */

    }

}

//                   65
//                  /   \
//                 60     50
//                / \    /  \
//               55
//
//
//
//
//

