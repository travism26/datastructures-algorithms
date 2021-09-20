package datastructure.algorithms.sorting;

public class MergeSort implements ISorter {
    @Override
    public int[] sort(int[] array) {
        mergeSort(array, 0, array.length);
        return array;
    }

    // this is recursive function base case is if start - finish is < 2 we are done.
    public void mergeSort(int[] input, int start, int end) {
        if (end - start < 2){
            return;
        }
        // partition the array passed in
        int mid = (start + end) / 2;
        // start on left side
        mergeSort(input, start,mid);
        // the end index is always 1 greater then the last index in the array
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public void merge(int[] input, int start, int mid, int end) {

        // input[mid-1] => last element in left partition
        // input[mid]   => First element in right partition
        // if the last element in left if smaller or equal to
        // first in right partition that means they are already
        // sorted.
        if(input[mid -1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while(i<mid && j<end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // Special condition what if
        // ---> Left: { 12, 15 }
        // ---> Right:{ 13, 20, 21 }
        // Left over right array elements are always GREATER hence why they are not copied
        // remove needless work
        // Same does NOT work with flip side
        // ---> L: { 12, 20, 21 }
        // ---> R: { 13, 15 }
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start,tempIndex);

    }

    @Override
    public void print(int[] array) {
        System.out.println("Merge Sort:");
        for (int val: array){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
