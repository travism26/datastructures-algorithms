package datastructure.algorithms.sorting;

public class SelectionSort implements ISorter{
    @Override
    public int[] sort(int[] array) {
        int[] sortedArray = array;
        for(int lastUnsortedIndex= sortedArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest=0;
            for (int i = 1; i<=lastUnsortedIndex; i++){
                if (sortedArray[i] > sortedArray[largest]){
                    largest = i;
                }
            }
            swap(sortedArray, largest, lastUnsortedIndex);
        }
        return sortedArray;
    }

    @Override
    public void print(int[] array) {
        System.out.println("Selection Sort:");
        for (int val: array){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public void swap(int[] array, int i, int j) {
        if (i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
