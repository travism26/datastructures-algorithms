package datastructure.algorithms.heaps;

import java.util.List;

public class MinHeap extends Heap {
    public MinHeap(List<Integer> myList) {
        super(myList);
    }

    public boolean isMinHeapPropertySatisfied() {
        List<Integer> array = this.heap;
        for (int currentIdx = 1; currentIdx < array.size(); currentIdx++) {
            int parentIdx = (currentIdx - 1) / 2;
            if (parentIdx < 0) {
                return true;
            }
            if (array.get(parentIdx) > array.get(currentIdx)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void fixHeapBelow(int currentIndex, int endIndex, List<Integer> heap) {
        int childSwap;
        while (currentIndex <= endIndex) {
            int leftChild = getChild(currentIndex, true);
            int rightChild = getChild(currentIndex, false);

            // check if we have 1 of 2 conditions
            //  -> do we have a left child?
            //  -> do we have a both left & right child?
            if (leftChild <= endIndex) {
                // check if we have a right child if yes we need to find smaller of the two
                if (rightChild > endIndex) {
                    childSwap = leftChild;
                } else {
                    // we have both right & left child
                    // find the smallest of the two
                    childSwap = (heap.get(leftChild) < heap.get(rightChild) ? leftChild : rightChild);
                }
                // Now we have the "Smallest" of the children we now compare against the current
                if (heap.get(currentIndex) > heap.get(childSwap)) {
                    swap(currentIndex, childSwap, heap);
                    currentIndex = childSwap;
                } else {
                    // the children are GREATER than the parent do nothing!
                    return;
                }
            } else {
                // we are at the bottom of the HEAP no children to compare against
                break;
            }
        }
    }

    @Override
    public void fixHeapAbove(int currentIndex, List<Integer> heap) {
        // get the newValue that we "Just" added
        int newValue = heap.get(currentIndex);
        // Since we are fixing above we need the parent of this currentIndex
        // again this is not required you can replace parentIndex -> getParent(currentIndex)
        int parentIndex = getParent(currentIndex); // this is just to make it easier to read
        // if the current index = 0 (root) exit, AND newValue LESS currentIndex's Parent.
        while(currentIndex > 0 && newValue < heap.get(parentIndex)) {
            // Swap the current with its parent (fix above)
            swap(currentIndex, parentIndex, heap);
            // set the current = parent index since thats where we are now at
            currentIndex = parentIndex;
            // get the new parentIndex
            parentIndex = getParent(currentIndex);
        }
    }

    public String toString() {
        return this.heap.toString();
    }
}