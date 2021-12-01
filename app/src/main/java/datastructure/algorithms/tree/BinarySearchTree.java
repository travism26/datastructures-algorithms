package datastructure.algorithms.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class BinarySearchTree {
    public int value;
    public BinarySearchTree left;
    public BinarySearchTree right;

    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<Integer>();

        stack.push(1);
        stack.push(2);
        System.out.println(stack.toString());
        System.out.println(stack.pop());
        System.out.println(stack.peek());


    }

    public BinarySearchTree(int value) {
        this.value = value;
    }

    //      subcases: >, <, =
    public BinarySearchTree insert(int value) {
        BinarySearchTree currentNode = this;
        while (true) {
            // <, we want to explore the left subtree
            if (value < currentNode.value) {
                if (currentNode.left == null) {
                    // check if the left node is null if yes add new BinarySearch node here.
                    currentNode.left = new BinarySearchTree(value);
                    break;
                }
                // if the left node exists we need to traverse down that tree and find next insertion point.
                else {
                    currentNode = currentNode.left;
                }
            }
            // >= we want to explore the right subtree
            else {
                if (currentNode.right == null) {
                    currentNode.right = new BinarySearchTree(value);
                    break;
                } else {
                    currentNode = currentNode.right;
                }
            }
        }
        return this;
    }

    // three sub cases <, >, =
    public boolean contains(int value) {
        BinarySearchTree currentNode = this;
        while (currentNode != null) {
            if (value < currentNode.value) {
                currentNode = currentNode.left;
            } else if (value > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public BinarySearchTree remove(int value) {
        remove(value, null);
        return this;
    }

    public void remove(int value, BinarySearchTree parentNode) {
        BinarySearchTree currentNode = this;
        while (currentNode != null) {
            // if the removal value is less that current node value: removal:5 currentNode: 10
            // we need to hit up the left side of the BinarySearch. set the parent to current and set the
            // NEW current node to the left value.
            if (value < currentNode.value) {
                parentNode = currentNode;
                currentNode = currentNode.left;
            }
            // This means the removal value is on the right side of the BinarySearch.
            else if (value > currentNode.value) {
                parentNode = currentNode;
                currentNode = currentNode.right;
            }
            // We found the removal NODE now we have a condition on properly setting up the
            // children values. we cant just delete this and not connect the children nodes.
            // Sub cases: no children (easiest), 1 children, 2 children and single node tree.
            else {
                // case: node has two children (left, right)
                if (currentNode.left != null && currentNode.right != null) {
                    currentNode.value = currentNode.right.getMinValue();
                    currentNode.right.remove(currentNode.value, currentNode);
                }

                // These are the cases where we don't have two child cases.
                // 1) Node does NOT have a parent node
                //      -> root node, this does NOT have a parent node
                // 2) Node doesn't have two children (either 1 child or NONE)

                // This is the first case: 1 Node is the root node.
                else if (parentNode == null) {
                    // If we only have one node (left) we replace all the current nodes values
                    // with the currentNode.left values. Node we only change currentNode.left LAST
                    // this is important because we dont want to overwrite and lose data before we
                    // stop needing it.
                    if (currentNode.left != null) {
                        currentNode.value = currentNode.left.value;
                        currentNode.right = currentNode.left.right;
                        currentNode.left = currentNode.left.left;
                    }
                    // same as above but right side.
                    else if (currentNode.right != null) {
                        currentNode.value = currentNode.right.value;
                        currentNode.left = currentNode.right.left;
                        currentNode.right = currentNode.right.right;
                    } else {
                        // Single node tree...
                        // do nothing this is a single node tree.
                    }
                }
                // Case 2: 2 sub-cases: left node and right node.
                //      -> where the node only has left node
                //      -> Where the node only has right node

                // Left Node
                else if (parentNode.left == currentNode) {
                    parentNode.left = currentNode.left != null ? currentNode.left : currentNode.right;
                }
                // Right Node
                else if (parentNode.right == currentNode) {
                    parentNode.right = currentNode.left != null ? currentNode.left : currentNode.right;
                }
                break;
            }
        }
    }

    public int getMinValue() {
        if (left == null) {
            return this.value;
        } else {
            return left.getMinValue();
        }
    }

    public boolean validateBst(BinarySearchTree tree) {
        return validateBstHelper(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean validateBstHelper(BinarySearchTree tree, int min, int max) {

        // base case for recursive call
        if (tree == null) {
            return true;
        }

        // If we fall outside of the min OR max Value
        // True condition: MIN < Tree.value <= MAX
        else if (tree.value < min || tree.value >= max) {
            return false;
        }
        return validateBstHelper(tree.left, min, tree.value) && validateBstHelper(tree.right, tree.value, max);
    }

    public static List<Integer> branchSums(BinarySearchTree root) {
        // conditions
        // 1: both child nodes are null
        //		->
        // 2: 1 child node is null
        //		-> left child is null
        //		-> right child is null
        LinkedList<BinarySearchTree> parents = new LinkedList<BinarySearchTree>();
        BinarySearchTree currentChild = root;
        ArrayList<Integer> sumList = new ArrayList<>();
        int currentSum = 0;
        while(true) {
            // System.out.println(parents.toString());
            if (currentChild.left == null && currentChild.right == null) {
                // this is the case where we hit the bottom of the tree
                // calculate sub of this last node return sum
                // and check for parent node if exist pop and set current child
                // to right node of that parent.
                // currentSum += currentChild.value;
                System.out.println("currentSum:"+ currentSum);
                sumList.add(currentSum + currentChild.value); // add this end results to arraylist
                System.out.println("sumlist"+ sumList.toString());
                // find next parent with right child subtracting the value as we pop
                if (parents.peek() != null) {
                    // set child to parent.right if null we use loop to find next righ
                    while (true) {
                        if (parents == null) {
                            return sumList;
                        }
                        System.out.println("current Child:"+ currentChild.value);
                        System.out.println("parent:"+ parents.peek().value);
                        // ### RIGHT NODE ###

                        if(currentChild == parents.peek().right) {
                            currentChild = parents.pop();
                            currentSum = currentChild != null ? currentSum-currentChild.value : currentSum;
                        }
                        // ### LEFT NODE ###
                        else {
                            if (parents.peek().right != null) { // we have a right child
                                currentChild = parents.peek().right;
                                break;
                            }
                            else {
                                currentChild = parents.pop();
                                currentSum -= currentChild.value;
                            }
                        }
                        if (currentSum == 0) {
                            return sumList;
                        }
                    }
                } else {
                    // no parents to explore break out
                    break;
                }
            } else if (currentChild.left != null) {
                // left has a node add to queue and add to sum
                // 1) calculate new sum
                // 2) push child to parents (top of stack)
                // 3) update new child to left
                currentSum += currentChild.value;
                parents.push(currentChild);
                currentChild = currentChild.left;
            } else {
                // we check the left its null now check right
                currentSum += currentChild.value;
                parents.push(currentChild);
                currentChild = currentChild.right;
            }
        }
        return sumList;
    }
}


//        public void remove(int value, BinarySearch parent) {
//            if (value < this.value) {
//                if (left != null) {
//                    left.remove(value, this);
//                }
//            } else if (value > this.value) {
//                if (right != null) {
//                    right.remove(value, this);
//                }
//            }
//            // we found the value to remove next we have sub edge/sub cases
//            else {
//                // edge case we have children on both sides
//                if (left != null && right != null) {
//                    // get the smallest value on the right hand side.
//                    this.value = right.getMinValue();
//                    // next we remove smallest value since we assigned it to this.value.
//                    right.remove(this.value, this);
//                }
//                // Sub case: we are messing with the root node
//                else if (parent == null) {
//                    // if the left node is not null take the values there
//                    if (left != null) {
//                        this.value = left.value;
//                        right = left.right;
//                        left = left.left;
//                    }
//                    // if the right node is NOT null use them
//                    else if (right != null) {
//                        this.value = right.value;
//                        left = right.left;
//                        right = right.right;
//                    }
//                    else {
//                        // this is a single-node tree; do nothing...
//                    }
//                }
//
//                else if (parent.left == this) {
//                    parent.left = left != null ? left : right;
//                }
//
//                else if (parent.right == this) {
//                    parent.right = left != null ? left : right;
//                }
//            }
//        }