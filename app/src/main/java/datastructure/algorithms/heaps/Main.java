package datastructure.algorithms.heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>(
                Arrays.asList(-7, 2, 3, 8, -10, 4, -6, -10, -2, -7, 10, 5, 2, 9, -9, -5, 3, 8));
        System.out.println("##Min heap##");
        MinHeap minHeap = new MinHeap(myList);
        System.out.println(minHeap.peek());
        System.out.println(minHeap.remove());
        System.out.println(minHeap.remove());
        System.out.println("Is min-heap property valid:"+minHeap.isMinHeapPropertySatisfied());
        minHeap.printHeap();
        minHeap.insert(-12);
        minHeap.printHeap();

        System.out.println("##Max heap##");
        List<Integer> myListTwo = new ArrayList<Integer>(
                Arrays.asList(-7, 2, 3, 8, -10, 4, -6, -10, -2, -7, 10, 5, 2, 9, -9, -5, 3, 8));
        MaxHeap maxHeap = new MaxHeap(myListTwo);
        maxHeap.printHeap();
        System.out.println("Is Max-heap property valid:"+maxHeap.isMaxHeapPropertySatisfied());
    }
}
