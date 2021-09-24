package datastructure.algorithms.heaps;

public class ArrayHeap {

    // left child   = 2i + 1;
    // right child  = 2i + 2;
    // Parent       = floor((i-2) / 2) floor = Round down to the smallest whole value

    public static void main(String[] args) {
        Heap heap = new Heap(10);

        heap.insert(80);
        heap.insert(75);
        heap.insert(60);
        heap.insert(68);
        heap.insert(55);
        heap.insert(40);
        heap.insert(52);
        heap.insert(67);

        heap.printHeap();
        heap.delete(5);
        heap.printHeap();
    }
}
