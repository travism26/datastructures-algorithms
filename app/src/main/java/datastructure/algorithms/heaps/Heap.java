package datastructure.algorithms.heaps;

public class Heap {

    private int[] heap;
    private int size;

    public Heap(int capacity) {
        this.heap = new int[capacity];
    }

    public void insert(int value) {
        if(isFull()) {
            throw new IndexOutOfBoundsException("Heap is full");
        }

        heap[size] = value; // we potentially need to heapify the heap

        fixHeapAbove(size);
        // add this after we resize the heap because if we do it
        // during the setting we will need to subtract it within the fixHeapAbove method
        size++;
    }

    public int delete(int index) {
        // Generally when you remove something from the heap its usually the root.
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        // Get the parent of deleted item
        int parent = getParent(index);
        // return this at the end of the method
        int deletedValue = heap[index];

        // Right most value will be placed at the value we are removing!
        // This is the replacement value to keep it a heap ish
        heap[index] = heap[size - 1];

        // look up or down the heap
        if (index == 0 || heap[index] < heap[parent]) {
            fixHeapBelow(index, size - 1);
        } else {
            fixHeapAbove(index);
        }

        size--;

        return deletedValue;
    }

    public void sort() {
        int lastHeapIndex = size - 1;

        for (int i = 0; i < lastHeapIndex; i++) {
            int temp = heap[0];
            heap[0] = heap[lastHeapIndex - i];
            heap[lastHeapIndex - i] = temp;
            // why are we adding lastHeapIndex - i - 1?
            // size always points to the next available spot so we need to point at the end `-1`
            // next why `- i` part? well we need to exclude the last spot since we are sorting
            // and this is a max heap we are putting the largest value in the correct spot so
            // we want to ignore that when we heapify this heap.
            fixHeapBelow(0, lastHeapIndex - i - 1);
        }
    }

    private void fixHeapBelow(int index, int lastHeapIndex) {
        int childSwap;

        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);
            if (leftChild <= lastHeapIndex) {
                // this node has a left child
                if (rightChild > lastHeapIndex) {
                    // does NOT have a rightChild aka index we calculated is outside of the heap size.
                    childSwap = leftChild;
                } else {
                    childSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }
                if (heap[index] < heap[childSwap]) {
                    int tmp = heap[index];
                    heap[index] = heap[childSwap];
                    heap[childSwap] = tmp;
                } else {
                    break;
                }
                index = childSwap;
            } else {
                break;
            }
        }

    }

    public void fixHeapAbove(int index) {
        int newValue = heap[index]; // we just inserted this guy
        while(index > 0 && newValue > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)]; // assign the parent where the new value is
            index = getParent(index);
        }
        heap[index] = newValue;
    }

    public int peek() {
        if (isEmpty()){
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        return heap[0];
    }

    public void printHeap() {
        for (int i = 0; i<size; i++) {
            System.out.print(heap[i]);
            System.out.print(", ");
        }
        System.out.println();
    }
    public boolean isFull() {
        return size == heap.length;
    }

    public int getParent(int index) {
        return (index -1) / 2;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getChild(int index, boolean left) {
        return (2 * index) + (left ? 1: 2);
    }


}
