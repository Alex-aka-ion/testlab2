package com.company;

public class MyNode {
    private int value;
    public MyNode left;
    public MyNode right;

    MyNode(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }

    void addBranch(int x) {
        if (x < this.getValue()) {
            if (this.left == null) {
                this.left = new MyNode(x);
            } else {
                this.left.addBranch(x);
            }
        } else {
            if (this.right == null) {
                this.right = new MyNode(x);
            } else {
                this.right.addBranch(x);
            }
        }
    }

    public MyNode chooseNextNode(int v) {
        if (v < this.getValue()) {
            return this.left;
        } else {
            return this.right;
        }
    }
}
