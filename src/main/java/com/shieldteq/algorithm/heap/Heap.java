package com.shieldteq.algorithm.heap;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Heap {
    private final List<Integer> heap = new ArrayList<>();

    public void init() {
        heap.add(0);
        heap.add(1);
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(5);
        heap.add(6);
        heap.add(7);
        heap.add(8);
        heap.add(9);
        heap.add(10);
        heap.add(11);
        heap.add(12);
        heap.add(13);
        heap.add(14);
    }

    //                   0
    //                  / \
    //                 1   2
    //                / \ / \
    //               3  4 5  6
    //
    //  root = 0, child1 = 1, child2 = 2
    //  child = 1, child1 = 3, child2 = 4
    //  child  = 2, child1 = 5, child2 = 6
    //  parent = x, child1 = 2x+1, child2 = 2x+2
    //
    //  child = y, parent = (y-1)/2
    //
    //

    public void printHeap(int left, int right) {
        System.out.println();
        for (int i = left; i <= right; i++) {
            if (i >= heap.size()) return;
            System.out.print(heap.get(i) + (i % 2 == 0 ? " " : "-"));
        }
        printHeap(leftChild(left), rightChild(right));

    }

    public int leftChild(int index) {
        return 2 * index + 1;
    }

    public int rightChild(int index) {
        return 2 * index + 2;
    }

    public int parent(int index) {
        return (index - 1) / 2;
    }

    public void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {
        int position = heap.size();
        heap.add(value);
        int parentPosition = parent(position);
        int parentValue = heap.get(parentPosition);

        while(parentValue < value){
            swap(parentPosition, position);
            position = parentPosition;
            parentPosition = parent(parentPosition);
            value = heap.get(position);
            parentValue = heap.get(parentPosition);
        }
    }

    public Integer remove() {
        if (heap.isEmpty()) {
            return null;
        }

        if (heap.size() == 1) {
            return heap.removeFirst();
        }

        int maxValue = heap.getFirst();
        heap.set(0, heap.removeLast());
        sinkDown(0);

        return maxValue;
    }
    private void sinkDown(int index) {
        int maxIndex = index;
        while (true) {
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);

            if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
                maxIndex = leftIndex;
            }

            if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
                maxIndex = rightIndex;
            }

            if (maxIndex != index) {
                swap(index, maxIndex);
                index = maxIndex;
            } else {
                return;
            }
        }
    }

}
