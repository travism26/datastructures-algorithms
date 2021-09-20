package datastructure.algorithms.sorting;

public class CountingSort implements ISorter {
    @Override
    public int[] sort(int[] array) {
        return new int[0];
    }

    public void countingSort(int[] input, int min, int max){
        int[] counterArray = new int[max-min +1];
        for (int i =0; i<input.length; i++){
            counterArray[input[i] - min]++; //translate value to its index value.
        }

        int j = 0;
        for (int i = min; i<= max; i++){
            while(counterArray[i-min] > 0){
                input[j++] = i;
                counterArray[i-min]--;
            }
        }
    }

    @Override
    public void print(int[] array) {

    }
}
