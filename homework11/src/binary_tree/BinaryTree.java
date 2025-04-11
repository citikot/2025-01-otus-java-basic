package src.binary_tree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BinaryTree<T extends Comparable<? super T>> implements SearchTree<T> {

    List<Integer> listToConvert = Arrays.asList(2, 10, 40, 50, 15, 18, 54, 145, 96, 78, 35, 16, 21, 44, 83);

    BinaryTreeNode<T> root;

    @Override
    public T find(T element) {
        return findRecursive(root, element);
    }

    private T findRecursive(BinaryTreeNode<T> node, T element) {
        if (node == null) {
            return null;
        }

        if (node.getPayload().equals(element)) {
            return node.getPayload();
        }

        T leftResult = findRecursive(node.getLeftNode(), element);
        if (leftResult != null) {
            return leftResult;
        }

        return findRecursive(node.getRightNode(), element);
    }

    @Override
    public List<T> getSortedList() {
        listToConvert.sort(Comparator.naturalOrder());
        return (List<T>) listToConvert;
    }

    public void sortedListToTree(List<T> sortedList) {
        if (sortedList == null || sortedList.isEmpty()) {
            this.root = null;
        }
        this.root = buildNode(sortedList, 0, sortedList.size() - 1);
    }

    private BinaryTreeNode<T> buildNode(List<T> list, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        BinaryTreeNode<T> node = new BinaryTreeNode<T>(list.get(mid));
        node.setLeftNode(buildNode(list, left, mid - 1));
        node.setRightNode(buildNode(list, mid + 1, right));
        return node;
    }

}

