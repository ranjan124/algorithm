package com.shieldteq.algorithm.linkedlist;

public class LinkedList {
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
}
