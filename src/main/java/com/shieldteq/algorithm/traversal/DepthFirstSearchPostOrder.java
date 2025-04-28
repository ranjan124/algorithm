package com.shieldteq.algorithm.traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearchPostOrder extends BST {

    public DepthFirstSearchPostOrder(int value) {
        super(value);
    }

    public List<Integer> rPostOrderTraversal() {
        List<Integer> dfsList = new ArrayList<>();
        rPostOrderTraversal(getRoot(), dfsList);
        return dfsList;
    }

    private void rPostOrderTraversal(Node node, List<Integer> dfsList) {
        if(node == null) return;
        rPostOrderTraversal(node.left, dfsList);
        rPostOrderTraversal(node.right, dfsList);
        dfsList.add(node.value);
    }

    public List<Integer> postOrderTraversal() {
        if (getRoot() == null)
            return List.of();
        List<Integer> dfsList = new ArrayList<>();
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        // Push root to first stack
        stack1.push(getRoot());

        // Run while first stack is not empty
        while (!stack1.isEmpty()) {
            Node curr = stack1.pop();
            stack2.push(curr);

            if (curr.left != null) {
                stack1.push(curr.left);
            }

            if (curr.right != null) {
                stack1.push(curr.right);
            }
        }

        // Print all elements of second stack
        while (!stack2.isEmpty()) {
            dfsList.add(stack2.pop().value);
        }
        return dfsList;
    }
}
