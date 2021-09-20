package datastructure.algorithms.sorting;

public class QuickSort implements ISorter {
    @Override
    public int[] sort(int[] array) {
        quickSort(array, 0, array.length);
        return array;
    }

    public void quickSort(int[] input, int start, int end) {
        if (end - start < 2){
            return;
        }
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public int partition(int[] input, int start, int end){
        // This uses the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i < j){
            // use j to look for elements < pivot
            // NOTE: Empty loop body
            while (i < j && input[--j] >= pivot); // Notice the --j we need to
            // decrement before using or we'll get a index out of bound error.
            if (i < j) {
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <=pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }

    @Override
    public void print(int[] array) {
        System.out.println("Quick Sort:");
        for (int val: array){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
