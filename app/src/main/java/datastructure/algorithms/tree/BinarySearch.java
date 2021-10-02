package datastructure.algorithms.tree;

public class BinarySearch {

    public static void main(String[] args) {
        Tree binaryTree = new Tree();

        binaryTree.insert(25);
        binaryTree.insert(20);
        binaryTree.insert(15);
        binaryTree.insert(27);
        binaryTree.insert(30);
        binaryTree.insert(29);
        binaryTree.insert(26);
        binaryTree.insert(22);
        binaryTree.insert(32);
        binaryTree.insert(17);
        binaryTree.traverseInOrder();
        System.out.println();

        System.out.println(binaryTree.get(27));
        System.out.println(binaryTree.get(17));
        System.out.println(binaryTree.get(8888));
        System.out.println(binaryTree.max());
        System.out.println(binaryTree.min());
    }
}
