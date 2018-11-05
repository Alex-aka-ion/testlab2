package com.company;

public class TreeMain {
    public static void main(String[] args) {
        int[] test1 = new int[]{5, 1, 10, -1, 4, 8, 2, -11, 6, 5, 5, 1, -22, -11, -10, -13, -11, 7, 5, 7};
        //int[] test1 = new int[]{7,7,7,5,7};

        MyTree tree = new MyTree(test1);

        System.out.println("Finish build Tree");

        System.out.println("Tree contains 5: " + tree.contains(5));
        System.out.println("Tree contains 10: " + tree.contains(10));
        System.out.println("Tree contains 6: " + tree.contains(6));
        System.out.println("Tree contains -5: " + tree.contains(-5));
        System.out.println("Tree contains 66: " + tree.contains(66));
        System.out.println("Tree contains -11: " + tree.contains(-11));

        System.out.println("Tree count 10: " + tree.count(10));
        System.out.println("Tree count 5: " + tree.count(5));
        System.out.println("Tree count 66: " + tree.count(66));
        System.out.println("Tree count -11: " + tree.count(-11));
        System.out.println("Tree count 7: " + tree.count(7));
    }
}
