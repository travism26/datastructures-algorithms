package datastructure.algorithms.heaps;

import java.util.List;

public class MaxHeap extends Heap{
    public MaxHeap(List<Integer> heap) {
        super(heap);
    }

    @Override
    public void fixHeapBelow(int currentIndex, int endIndex, List<Integer> heap) {
        int childSwap;

        while (currentIndex <= endIndex) {
            // we need to check for left and right children
            int leftChild = getChild(currentIndex, true);
            int rightChild = getChild(currentIndex, false);

            if (leftChild <= endIndex) {
                // we have a left child now check for right
                if (rightChild > endIndex) {
                    childSwap = leftChild;
                } else {
                    // we need to compare which child is larger (MAX heap)
                    childSwap = heap.get(leftChild) > heap.get(rightChild) ? leftChild : rightChild;
                }

                if(heap.get(currentIndex) < heap.get(childSwap)) {
                    swap(currentIndex, childSwap, heap);
                    currentIndex = childSwap;
                } else {
                    break;
                }
            } else {
                return;
            }
        }
    }

    @Override
    public void fixHeapAbove(int currentIndex, List<Integer> heap) {
        int newValue = heap.get(currentIndex);
        int parentIndex = getParent(currentIndex);
        while (currentIndex > 0 && heap.get(currentIndex) > heap.get(parentIndex)) {
            swap(currentIndex, parentIndex, heap);
            currentIndex = parentIndex;
            parentIndex = getParent(currentIndex);
        }
    }

    public boolean isMaxHeapPropertySatisfied() {
        List<Integer> array = this.heap;
        for (int currentIdx = 1; currentIdx < array.size(); currentIdx++) {
            int parentIdx = (currentIdx - 1) / 2;
            if (parentIdx < 0) {
                return true;
            }
            if (array.get(parentIdx) < array.get(currentIdx)) {
                return false;
            }
        }
        return true;
    }
}
