package com.shieldteq.algorithm.sorting;

public class SortNode {
    private int length;
    private Node root;

    public static class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public SortNode(int value) {
        root = new Node(value);
        length = 1;
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        Node temp = root;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(value);
        length++;
    }

    public void bubbleSort() {
        Node largestValueNode = null;
        while (largestValueNode != root.next) {
            Node walker = root;
            while (walker.next != largestValueNode) {
                if (walker.value > walker.next.value) {
                    int value = walker.value;
                    walker.value = walker.next.value;
                    walker.next.value = value;
                }
                walker = walker.next;
            }
            largestValueNode = walker;
        }
    }

    public void selectionSort() {
        Node temp = root;
        while (temp != null) {
            Node current = temp;
            Node minValue = temp;
            Node walker = temp;
            while (walker != null) {
                if (walker.value < minValue.value) {
                    minValue = walker;
                }
                walker = walker.next;
            }
            if (current != minValue) {
                int value = current.value;
                current.value = minValue.value;
                minValue.value = value;
            }
            temp = temp.next;
        }
    }

    public void insertionSort() {
        if (length < 2) {
            return; // List is already sorted
        }

        Node sortedListHead = root;
        Node unsortedListHead = root.next;
        sortedListHead.next = null;

        while (unsortedListHead != null) {
            Node current = unsortedListHead;
            unsortedListHead = unsortedListHead.next;

            if (current.value < sortedListHead.value) {
                current.next = sortedListHead;
                sortedListHead = current;
            } else {
                Node searchPointer = sortedListHead;
                while (searchPointer.next != null && current.value > searchPointer.next.value) {
                    searchPointer = searchPointer.next;
                }
                current.next = searchPointer.next;
                searchPointer.next = current;
            }
        }

        root = sortedListHead;
    }


    public void print() {
        Node temp = root;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
