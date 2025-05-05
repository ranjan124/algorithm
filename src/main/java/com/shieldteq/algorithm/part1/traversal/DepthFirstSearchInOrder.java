package com.shieldteq.algorithm.part1.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearchInOrder extends BST {
    public DepthFirstSearchInOrder(int value) {
        super(value);
    }

    public List<Integer> rInOrderTraversal2() {
        return rInOrderTraversal2(getRoot());
    }

    private List<Integer> rInOrderTraversal2(Node node) {
        if (node == null) return List.of();
        List<Integer> bfsList = new ArrayList<>(rInOrderTraversal2(node.left));
        bfsList.add(node.value);
        bfsList.addAll(rInOrderTraversal2(node.right));
        return bfsList;
    }

    public List<Integer> rInOrderTraversal() {
        List<Integer> bfsList = new LinkedList<>();
        rInOrderTraversal(getRoot(), bfsList);

        return bfsList;

    }

    private void rInOrderTraversal(Node node, List<Integer> bfsList) {
        if (node == null) return;
        rInOrderTraversal(node.left, bfsList);
        bfsList.add(node.value);
        rInOrderTraversal(node.right, bfsList);
    }

    public List<Integer> inOrderTraversal() {
        if (getRoot() == null) return List.of();
        Stack<Node> stack = new Stack<>();
        List<Integer> bfsList = new ArrayList<>();
        Node current = getRoot();
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            bfsList.add(current.value);
            current = current.right;
        }
        return bfsList;
    }
}
