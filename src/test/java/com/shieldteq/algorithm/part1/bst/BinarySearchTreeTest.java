package com.shieldteq.algorithm.part1.bst;

import com.shieldteq.algorithm.part1.bst.BinarySearchTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

    @Test
    public void insertTest() {

        BinarySearchTree myBST = new BinarySearchTree();

        System.out.println(myBST.insert(2));
        System.out.println(myBST.insert(1));
        System.out.println(myBST.insert(3));

        /*
            THE LINES ABOVE CREATE THIS TREE:
                         2
                        / \
                       1   3
        */


        System.out.println("Root: " + myBST.getRoot().value);
        System.out.println("\nRoot->Left: " + myBST.getRoot().left.value);
        System.out.println("\nRoot->Right: " + myBST.getRoot().right.value);


        /*
            EXPECTED OUTPUT:
            ----------------
            Root: 2

            Root->Left: 1

            Root->Right: 3

        */

    }

    @Test
    public void containsTest() {
        BinarySearchTree myBST = new BinarySearchTree();
        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);

        Assertions.assertTrue(myBST.contains(2));
        Assertions.assertFalse(myBST.contains(5));
    }


    @Test
    public void swapTest() {
        int[] items = new int[]{5, 6};
        for (int item : items) {
            System.out.println(item);
        }
        swapItems(items);
        System.out.println("After swap:");
        for (int item : items) {
            System.out.println(item);
        }
    }

    private void swapItems(int[] items) {
        int temp = items[0];
        items[0] = items[1];
        items[1] = temp;
    }
}
