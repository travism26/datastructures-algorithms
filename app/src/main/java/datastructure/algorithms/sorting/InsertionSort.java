package datastructure.algorithms.sorting;

public class InsertionSort implements ISorter{
    @Override
    public int[] sort(int[] array) {
        int[] sortedArray = array;
//        for(int firstUnsortedIndex =1; firstUnsortedIndex< sortedArray.length-1; firstUnsortedIndex++){
//            int newElement = sortedArray[firstUnsortedIndex];
//
//            int i;
//            for(i = firstUnsortedIndex; (i > 0 && sortedArray[i-1] > newElement); i--) {
//                sortedArray[i] = sortedArray[i-1];
//            }
//            sortedArray[i] = newElement;
//        }
        recursionInsertionSort(sortedArray,sortedArray.length);
        return sortedArray;
    }

    public void recursionInsertionSort(int[] input, int numItems) {

        if (numItems < 2) {
            return;
        }

        recursionInsertionSort(input, numItems -1);

        int newElement = input[numItems - 1];

        int i;
        for(i = numItems -1; (i > 0 && input[i-1] > newElement); i--) {
            input[i] = input[i-1];
        }
        input[i] = newElement;
        System.out.println("Results of call when numItems = " + numItems);
        for (i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println("-----------------------");
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
