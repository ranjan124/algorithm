package com.shieldteq.algorithm.dlinkedlist;

import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {
    @Test
    public void initTest() {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(7);
        myDoublyLinkedList.printAll();
    }

    @Test
    public void appendTest() {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(7);
        myDoublyLinkedList.append(1);
        myDoublyLinkedList.printAll();
    }

    @Test
    public void removeLastTest() {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(7);
        myDoublyLinkedList.append(2);
        myDoublyLinkedList.append(1);
        myDoublyLinkedList.printAll();
        myDoublyLinkedList.removeLast();
        myDoublyLinkedList.printAll();
    }

    @Test
    public void prependTest() {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(7);
        myDoublyLinkedList.prepend(3);
        myDoublyLinkedList.printAll();
        myDoublyLinkedList.prepend(1);
        myDoublyLinkedList.printAll();
    }

    @Test
    public void removeFirstTest() {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(7);
        myDoublyLinkedList.prepend(3);
        myDoublyLinkedList.prepend(1);
        myDoublyLinkedList.printAll();
        myDoublyLinkedList.removeFirst();
        myDoublyLinkedList.printAll();
        myDoublyLinkedList.removeFirst();
        myDoublyLinkedList.printAll();
        myDoublyLinkedList.removeFirst();
        myDoublyLinkedList.printAll();
    }
    @Test
    public void getTest() {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(7);
        myDoublyLinkedList.prepend(6);
        myDoublyLinkedList.prepend(5);
        myDoublyLinkedList.prepend(4);
        myDoublyLinkedList.prepend(3);
        myDoublyLinkedList.prepend(2);
        myDoublyLinkedList.prepend(1);
        System.out.println(myDoublyLinkedList.get(3).value);
    }
    @Test
    public void insertTest() {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(7);
        myDoublyLinkedList.prepend(6);
        myDoublyLinkedList.prepend(5);
        myDoublyLinkedList.prepend(4);
        myDoublyLinkedList.prepend(3);
        myDoublyLinkedList.prepend(2);
        myDoublyLinkedList.prepend(1);
        System.out.println(myDoublyLinkedList.insert(2, 99));
        System.out.println(myDoublyLinkedList.get(2).value);
    }
    @Test
    public void removeTest() {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(7);
        myDoublyLinkedList.prepend(6);
        myDoublyLinkedList.prepend(5);
        myDoublyLinkedList.prepend(4);
        myDoublyLinkedList.prepend(3);
        myDoublyLinkedList.prepend(2);
        myDoublyLinkedList.prepend(1);
        System.out.println(myDoublyLinkedList.get(2).value);
        System.out.println(myDoublyLinkedList.remove(2).value);
        System.out.println(myDoublyLinkedList.get(2).value);
    }

    @Test
    public void swapFirstLastTest() {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(7);
        myDoublyLinkedList.prepend(6);
        myDoublyLinkedList.prepend(5);
        myDoublyLinkedList.prepend(4);
        myDoublyLinkedList.printAll();
        myDoublyLinkedList.swapFirstLast();
        myDoublyLinkedList.printAll();
    }

    @Test
    public void reverseTest() {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(7);
        myDoublyLinkedList.prepend(6);
        myDoublyLinkedList.prepend(5);
        myDoublyLinkedList.prepend(4);
        myDoublyLinkedList.printAll();
        myDoublyLinkedList.reverse();
        myDoublyLinkedList.printAll();
    }

    @Test
    public void isPalindromeTest() {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(7);
        myDoublyLinkedList.prepend(6);
        myDoublyLinkedList.prepend(5);
        myDoublyLinkedList.prepend(6);
        myDoublyLinkedList.prepend(7);
        System.out.println(myDoublyLinkedList.isPalindrome());
    }

    @Test
    public void swapPairsTest() {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(7);
        myDoublyLinkedList.prepend(6);
        myDoublyLinkedList.prepend(5);
        myDoublyLinkedList.prepend(4);
        myDoublyLinkedList.prepend(3);
        myDoublyLinkedList.swapPairs();
        myDoublyLinkedList.printAll();
    }

}
