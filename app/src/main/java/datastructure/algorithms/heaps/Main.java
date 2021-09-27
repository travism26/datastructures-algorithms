package datastructure.algorithms.heaps;

import java.util.PriorityQueue;

public class Main {

    // left child   = 2i + 1;
    // right child  = 2i + 2;
    // Parent       = floor((i-2) / 2) floor = Round down to the smallest whole value

    // Priority heaps use MAX heap
    // We build the heap as a max heap to use priority heap
    //      -> highest priority always at the ROOT of the heap.
    // Min heap is the opposite,
    //      -> Lowest number at the root
    // Multi threaded use the PriorityBlockingQueue class

    public static void main(String[] args) {
//        Heap heap = new Heap(10);
//
//        heap.insert(80);
//        heap.insert(75);
//        heap.insert(60);
//        heap.insert(68);
//        heap.insert(55);
//        heap.insert(40);
//        heap.insert(52);
//        heap.insert(67);
//
//        heap.printHeap();
//        heap.sort();
//        heap.printHeap();
//        heap.printHeap();
//        System.out.println(heap.peek());
//        heap.delete(0);
//        System.out.println(heap.peek());

        String a = "good";
        String out = a.substring(0,1);
        System.out.println(out);

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("aba");
        pq.add("aca");
        pq.add("aaa");
        pq.add("cca");
        pq.add("aba");
        System.out.println(pq.size());
//
//        System.out.println(pq.peek());
//        System.out.println(pq.poll());
//        System.out.println(pq.peek());
//        pq.add(25);
//        pq.add(-22);
//        pq.add(1343);
//        pq.add(54);
//        pq.add(0);
//        pq.add(-3492);
//        pq.add(429);
//
//        System.out.println(pq.peek()); // -3492
//        System.out.println(pq.remove()); // -3492
//        System.out.println(pq.peek()); // -22
//        System.out.println(pq.poll()); // -22
//        System.out.println(pq.peek()); // 0
//        System.out.println(pq.remove(54)); // true => successfully remove it
//        Object[] ints = pq.toArray();
//
//        System.out.println("-----loop-----");
//        for (Object num: ints) {
//            System.out.println(num);
//        }
//        System.out.println("-----loop-----");
//        System.out.println(pq.peek()); // 0
//        pq.add(-1);
//        System.out.println(pq.peek()); // -1


        // if you create a queue using an object you need to implement
        // the comparable interface to ensure the class can properly
        // compare values.
    }
}
