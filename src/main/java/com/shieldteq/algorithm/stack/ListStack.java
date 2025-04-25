package com.shieldteq.algorithm.stack;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class ListStack<T> {

    private final ArrayList<T> stackList = new ArrayList<>();

    public void printStack() {
        for (int i = stackList.size() - 1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.getLast();
        }
    }

    public int size() {
        return stackList.size();
    }


    public void push(T item) {
        stackList.add(item);
    }

    public T pop(T item) {
        if (isEmpty()) return null;
//        return stackList.remove(stackList.size() - 1);
        return stackList.removeLast();
    }

}
