package com.shieldteq.algorithm.traversal;

import lombok.Getter;

@Getter
public class BST {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public BST(int value) {
        root = new Node(value);
    }

    public void rInsert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        } else {
            rInsert(root, value);
        }
    }

    private void rInsert(Node node, int value) {
        if (value < node.value) {
            if (node.left == null) {
                node.left = new Node(value);
            } else {
                rInsert(node.left, value);
            }
        } else if (value > node.value) {
            if (node.right == null) {
                node.right = new Node(value);
            } else {
                rInsert(node.right, value);
            }
        }
    }


    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = new Node(value);
        } else {
            insert(newNode);
        }
    }

    private void insert(Node node) {
        Node pos = findInsertPos(node);
        if (node.value < pos.value) {
            pos.left = node;
        } else {
            pos.right = node;
        }
    }

    private Node findInsertPos(Node node) {
        Node temp = root;
        Node walker = root;
        while (walker != null) {
            temp = walker;
            if (node.value < walker.value) {
                walker = walker.left;
            } else {
                walker = walker.right;
            }
        }
        return temp;
    }
}
