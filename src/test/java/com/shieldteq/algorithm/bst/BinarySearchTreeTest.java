package com.shieldteq.algorithm.bst;

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
}
