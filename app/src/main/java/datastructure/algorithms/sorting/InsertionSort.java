package datastructure.algorithms.sorting;

public class InsertionSort implements ISorter{
    @Override
    public int[] sort(int[] array) {
        int[] sortedArray = array;
        for(int firstUnsortedIndex =1; firstUnsortedIndex< sortedArray.length-1; firstUnsortedIndex++){
            int newElement = sortedArray[firstUnsortedIndex];

            int i;
            for(i = firstUnsortedIndex; (i > 0 && sortedArray[i-1] > newElement); i--) {
                sortedArray[i] = sortedArray[i-1];
            }
            sortedArray[i] = newElement;
        }
        return sortedArray;
    }

    @Override
    public void print(int[] array) {
        System.out.println("Insertion Sort:");
        for (int val: array){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
