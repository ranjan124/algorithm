package com.shieldteq.algorithm.dlinkedlist;

import lombok.Getter;

@Getter
public class DoublyLinkedList {

    public static class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }


    private Node head;
    private Node tail;
    private int length = 0;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;

        }

        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = tail;
        if (length == 1) {
            tail = null;
            head = null;
            length--;
            return temp;
        }
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        Node first = head;
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = first.next;
            first.next = null;
        }
        length--;
        return first;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        int center = length / 2; // 3-1, 4-2
        if (index < center) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            int count = 0;
            for (int i = length - 1; i > index; i--) {
                System.out.println("count" + ++count);
                temp = temp.prev;
            }

        }
        return temp;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
        } else if (index == length) {
            append(value);
        } else {
            Node node = get(index);
            Node newNode = new Node(value);
            Node prev = node.prev;
            prev.next = newNode;
            newNode.prev = prev;
            newNode.next = node;
            node.prev = newNode;
            length++;
        }

        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;

        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }

        Node node = get(index);
        Node previous = node.prev;
        Node nextNode = node.next;
        previous.next = nextNode;
        nextNode.prev = previous;
        node.next = null;
        node.prev = null;
        length--;
        return node;
    }

    public void swapFirstLast() {
        if (length < 2) return;
        if (length == 2) {
            Node temp = head;
            head = tail;
            tail = temp;
            head.next = tail;
            head.prev = null;
            tail.next = null;
            tail.prev = head;
        } else {
            Node toTail = head;
            Node toHead = tail;
            toHead.next = head.next;
            toTail.prev = tail.prev;
            toHead.prev = null;
            toTail.next = null;
            toHead.next.prev = toHead;
            toTail.prev.next = toTail;

            head = toHead;
            tail = toTail;
        }
    }

    public void reverse() {

        Node currentNode = head;
        Node tempNode;

        while (currentNode != null) {
            tempNode = currentNode.prev;
            currentNode.prev = currentNode.next;
            currentNode.next = tempNode;
            currentNode = currentNode.prev;
        }
        tempNode = head;
        head = tail;
        tail = tempNode;
    }

    boolean isPalindrome() {
        if (length < 2) {
            return true;
        }
        int center = length / 2;
        Node tmpHead = head;
        Node tmpTail = tail;
        for (int i = 0; i < center; i++) {
            if (tmpHead.value != tmpTail.value) return false;
            tmpHead = tmpHead.next;
            tmpTail = tmpTail.prev;
        }
        return true;
    }


    public void swapPairs() {
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node previousNode = dummyNode;

        while (head != null && head.next != null) {
            Node firstNode = head;
            Node secondNode = head.next;

            previousNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            secondNode.prev = previousNode;
            firstNode.prev = secondNode;

            if (firstNode.next != null) {
                firstNode.next.prev = firstNode;
            }

            head = firstNode.next;
            previousNode = firstNode;
        }

        head = dummyNode.next;
        if (head != null) head.prev = null;
    }

}

