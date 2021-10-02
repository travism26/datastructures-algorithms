package datastructure.algorithms.tree;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;
//    private int count;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data){
            return;
        }

        if (value < data) {
            if (leftChild == null) {
                // insert here
                leftChild= new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }

    }

    public TreeNode get(int value) {
        if (value == data) {
            return this;
        }

        if (value < data) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }

        return null;
    }

    public int min() {
        if(this.leftChild == null) {
            return this.data;
        } else {
            return this.leftChild.min();
        }
    }

    public int max() {
        if (this.rightChild == null) {
            return this.data;
        } else {
            return this.rightChild.max();
        }

    }

    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print(data +", ");
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
