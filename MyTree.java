package com.company;

public class MyTree {
    private MyNode root;

    MyTree (int[] inputList) {
        boolean first = true;
        for (int value : inputList) {
            if (first) {
                root = new MyNode(value);
                first = false;
            } else {
                root.addBranch(value);
            }
        }
    }

    boolean contains(int v) {
        MyNode tmpNode = this.root;

        while (tmpNode != null) {
            if (tmpNode.getValue() == v) {
                return true;
            } else {
                tmpNode = tmpNode.chooseNextNode(v);
            }
        }
        return false;
    }

    int count(int v) {
        int result = 0;
        MyNode tmpNode = this.root;

        while (tmpNode != null) {
            if (tmpNode.getValue() == v) {
                result++;
            }
            tmpNode = tmpNode.chooseNextNode(v);
        }
        return result;
    }
}
