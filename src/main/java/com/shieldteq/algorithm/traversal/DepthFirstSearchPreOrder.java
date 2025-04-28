package com.shieldteq.algorithm.traversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearchPreOrder extends BST {

    public DepthFirstSearchPreOrder(int value) {
        super(value);
    }

    public List<Integer> rPreOrderTraversal() {
        List<Integer> bfsList = new LinkedList<>();
        rPreOrderTraversal(getRoot(), bfsList);

        return bfsList;

    }

    private void rPreOrderTraversal(Node node, List<Integer> bfsList) {
        if (node == null) return;
        bfsList.add(node.value);
        rPreOrderTraversal(node.left, bfsList);
        rPreOrderTraversal(node.right, bfsList);
    }

    public List<Integer> preOrderTraversal() {
        if (getRoot() == null) return List.of();
        List<Integer> bfsList = new LinkedList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(getRoot());
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            bfsList.add(node.value);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return bfsList;
    }
}
