package com.shieldteq.algorithm.part1.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    public static class Node {

        public Node(int value) {
            this.value = value;
        }

        int value;
        Node next;
    }

    Node head;
    Node tail;
    int length;

    public LinkedList(int initialValue) {
        head = new Node(initialValue);
        tail = head;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int i) {
        Node newNode = new Node(i);
        length++;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        Node prev = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int i) {
        Node newNode = new Node(i);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void set(int index, int value) {
        Node temp = get(index);
        if (temp == null) return;
        temp.value = value;
    }

    public void insert(int index, int value) {
        Node temp = get(index - 1);
        Node newNode = new Node(value);
        if (temp == null) {
            newNode.next = head;
            this.head = newNode;
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
        length++;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }

    public void reverse() {
        Node tempHead = head;
        head = tail;

        // tail is assigned to head
        tail = tempHead;

        Node next;
        Node prev = null;
        for (int i = 0; i < length; i++) {
            next = tempHead.next;
            tempHead.next = prev;
            prev = tempHead;
            tempHead = next;
        }
    }

    public Node reverseList(Node head) {
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }

    public Node findMiddleNode() {
        if (head == null) return null;
        if (head.next == null) return head;
        Node temp = head;
        Node middle = head;
        int count = 0;
        while (temp != null) {
            count = (count + 1) % 2;
            temp = temp.next;
            if (count == 0) {
                middle = middle.next;
            }

        }
        return middle;
    }

    public Node findMiddleNode1() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node findKthFromEnd(int k) {
        if (head == null) return null;
        Node temp = head;
        Node found = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        while (temp != null && temp.next != null) {
            temp = temp.next;
            found = found.next;
        }
        return found;
    }

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void partitionList(int x) {
        Node current = head;
        if (current == null) {
            return;
        }
        Node prev = new Node(0);
        Node next = new Node(0);
        Node left = prev;
        Node right = next;
        while (current != null) {
            if (current.value < x) {
                left.next = current;
                left = current;
            } else {
                right.next = current;
                right = current;
            }
            current = current.next;
        }
        head = prev.next;
        left.next = next.next;
        right.next = null;
    }

    public void removeDuplicates() {
        Set<Integer> values = new HashSet<>();
        Node previous = null;
        Node current = head;
        while (current != null) {
            if (values.contains(current.value)) {
                previous.next = current.next;
                length -= 1;
            } else {
                values.add(current.value);
                previous = current;
            }
            current = current.next;
        }
    }

    public int binaryToDecimal() {
        int num = 0;
        Node current = head;
        while (current != null) {
            num = num * 2 + current.value;
            current = current.next;
        }
        return num;
    }

    public void reverseBetween(int startIndex, int endIndex) {
        if (head == null) return;

        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node previousNode = dummyNode;

        for (int i = 0; i < startIndex; i++) {
            previousNode = previousNode.next;
        }

        Node currentNode = previousNode.next;

        for (int i = 0; i < endIndex - startIndex; i++) {
            Node nodeToMove = currentNode.next;
            currentNode.next = nodeToMove.next;
            nodeToMove.next = previousNode.next;
            previousNode.next = nodeToMove;
        }

        head = dummyNode.next;
    }

}































