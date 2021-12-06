package datastructure.algorithms.heaps;

import java.util.ArrayList;
import java.util.List;

public abstract class Heap {
    List<Integer> heap = new ArrayList<Integer>();

    public Heap(List<Integer> heap) {
        this.heap = buildHeap(heap);
    }

    //    public abstract List<Integer> buildHeap(List<Integer> array);
    public abstract void fixHeapBelow(int currentIndex, int endIndex, List<Integer> heap);

    public abstract void fixHeapAbove(int currentIndex, List<Integer> heap);

    // this will build your heap depending on your child class.
    public List<Integer> buildHeap(List<Integer> array) {
        int firstParentIdx = (array.size() - 2) / 2;
        for (int currentIdx = firstParentIdx; currentIdx >= 0; currentIdx--) {
            this.fixHeapBelow(currentIdx, array.size() - 1, array);
        }
        return array;
    }

    public int remove() {
        swap(0, heap.size()-1, heap);
        int valueToRemove = heap.get(heap.size()-1);
        heap.remove(heap.size()-1);
        this.fixHeapBelow(0, heap.size() - 1, heap);
        return valueToRemove;
    }

    public void insert(int value) {
        heap.add(value);
        this.fixHeapAbove(heap.size()-1, heap);
    }

    public int peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }
        return heap.get(0);
    }

    public void printHeap() {
        for (int i = 0; i < heap.size(); i++) {
            System.out.print(heap.get(i));
            System.out.print(", ");
        }
        System.out.println();
    }

    public void swap(int i, int j, List<Integer> heap) {
        Integer temp = heap.get(j);
        heap.set(j, heap.get(i));
        heap.set(i, temp);
    }

    public List<Integer> getHeap() {
        return heap;
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public boolean isEmpty() {
        return this.heap.size() == 0;
    }

    public int getChild(int index, boolean left) {
        return (2 * index) + (left ? 1 : 2);
    }
}
