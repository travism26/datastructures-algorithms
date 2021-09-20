package datastructure.algorithms.sorting;

public class RadixSort implements ISorter {
    @Override
    public int[] sort(int[] array) {

        return new int[0];
    }

    public void radixSort(int[] input, int radix, int width) {

    }

    public void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for(int value: input){
            countArray[getDigit(position, value, radix)]++;
        }
        // Adjust count array, Num values with that digit or less then that digit.
        for(int j = 1; j < radix; j++) {
            countArray[j] += countArray[j-1];
        }

        int[] temp = new int[numItems];
        for(int tempIndex= numItems -1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex],radix )]] = input[tempIndex];
        }

        // copy temp array back to the input array.
        for (int tempIndex=0; tempIndex<numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }

    public int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
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
