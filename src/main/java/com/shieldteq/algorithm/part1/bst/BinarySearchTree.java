package com.shieldteq.algorithm.part1.bst;

import lombok.Getter;

@Getter
public class BinarySearchTree {

    private Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {
            Node leaf = findLeaf(value);
            if (value < leaf.value) {
                leaf.left = newNode;
            } else if (value > leaf.value) {
                leaf.right = newNode;
            } else {
                return false;
            }
        }
        return true;
    }

    public Node findLeaf(int value) {
        Node walker = root;
        Node temp = root;
        while (walker != null) {
            temp = walker;
            if (value < walker.value) {
                walker = walker.left;
            } else {
                walker = walker.right;
            }
        }
        return temp;
    }


    public boolean contains(int value) {
        Node walker = root;
        while(walker != null){
            if(value == walker.value) return true;

            walker = value < walker.value ? walker.left: walker.right;
        }


        return false;
    }
}
