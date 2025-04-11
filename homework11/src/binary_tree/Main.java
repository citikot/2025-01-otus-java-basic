package src.binary_tree;

import java.util.List;

public class Main {

    static BinaryTree<Integer> bt = new BinaryTree<>();

    public static void main(String[] args) {

        List<Integer> listToTree= bt.getSortedList();
        System.out.println(listToTree);
        bt.sortedListToTree(listToTree);
        System.out.println(bt.find(10));
        System.out.println(bt.find(40));
        System.out.println(bt.find(96));
        System.out.println(bt.find(1000));
        System.out.println(bt.find(2000));
    }
}
