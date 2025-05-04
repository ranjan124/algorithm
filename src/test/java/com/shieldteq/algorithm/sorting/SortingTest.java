package com.shieldteq.algorithm.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortingTest {
    @Test
    public void testBubbleSort() {
        int[] arr = {5, 4, 7, 3, 1, 6, 8, 2};

        Sorting sorting = new Sorting();
        sorting.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void testSelectionSort() {
        int[] arr = {5, 4, 7, 3, 1, 6, 8, 2};

        Sorting sorting = new Sorting();
        sorting.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    @Test
    public void testInsertionSort() {
        int[] arr = {5, 4, 7, 3, 1, 6, 8, 2};

        Sorting sorting = new Sorting();
        sorting.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testBubbleSortLinkedList() {
        SortNode node = new SortNode(4);
        node.insert(1);
        node.insert(3);
        node.insert(7);
        node.insert(2);
        node.insert(6);
        node.insert(5);
        node.bubbleSort();
        node.print();
    }

    @Test
    public void testSelectionSortLinkedList() {
        SortNode node = new SortNode(4);
        node.insert(1);
        node.insert(3);
        node.insert(7);
        node.insert(2);
        node.insert(6);
        node.insert(5);
        node.selectionSort();
        node.print();
    }

    @Test
    public void testInsertionSortLinkedList() {
        SortNode node = new SortNode(4);
        node.insert(1);
        node.insert(3);
        node.insert(7);
        node.insert(2);
        node.insert(6);
        node.insert(5);
        node.insertionSort();
        node.print();
    }

}
