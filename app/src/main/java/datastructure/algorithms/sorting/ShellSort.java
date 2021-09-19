package datastructure.algorithms.sorting;

public class ShellSort implements ISorter {
    @Override
    public int[] sort(int[] array) {
        int[] sortedArray = array;

        for(int gap = sortedArray.length / 2; gap > 0; gap /= 2) {

            for(int i = gap; i < sortedArray.length; i++){
                int newElement = sortedArray[i];
                int j = i;
                while (j >= gap && sortedArray[j-gap] > newElement){
                    sortedArray[j] = sortedArray[j-gap];
                    j-= gap;
                }

                sortedArray[j] = newElement;
            }

        }
        return sortedArray;
    }

    @Override
    public void print(int[] array) {
        System.out.println("Shell Sort:");
        for (int val: array){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
