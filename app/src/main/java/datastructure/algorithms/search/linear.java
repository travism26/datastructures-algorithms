package datastructure.algorithms.search;

public class linear {

    // Simple search O(n)
    public int search(int[] input, int value) {
        for (int i=0; i<input.length; i++) {
            if( input[i] == value) {
                return i;
            }
        }
        return -1;
    }
}


