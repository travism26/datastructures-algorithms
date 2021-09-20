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
        // Example 1:
        // ---> Left: { 12, 15 }
        // ---> Right:{ 13, 20, 21 }
        // Left over right array elements are always GREATER hence why they are not copied
        // remove needless work
        // Same does NOT work with flip side
        // Example 2:
        // ---> L: { 12, 20, 21 }
        // ---> R: { 13, 15 }
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start,tempIndex);

    }
/* Left Finishes first
 * Explaining why we do the first arraycopy above. If we hit the situation where left finishes first
 * this will mean we traversed the entire 'i' that means the `mid == i` that will make the arraycopy
 * with length `0` making no changes to the array, keeping `input` the same.
 * Input[12, 15, 13, 20, 21]
 * Temp[12, 13, 15]
 * Input[12, 13, 15, 20, 21] <-- Sorted array 
 *
 * Flip side: Right Finishes first
 * If the right side finishes first `j`, this means we have items left over in (i) since that is
 * the back of the array we need to copy them over to the front of the input array. Else they will
 * be overwritten with the second arraycopy. Example be from above `Example 2`
 * Input[12, 20, 21, 13, 15]
 * Temp[12, 13, 15]
 * Note 20, and 21 will get overwritten with second arraycopy we need to move them to the end index(3,4)
 * Since they are already sorted and we know they are larger then left we can just copy at the end.
 * Input[12, 13, 15, 20, 21] <-- Sorted array
 */
    @Override
    public void print(int[] array) {
        System.out.println("Merge Sort:");
        for (int val: array){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
