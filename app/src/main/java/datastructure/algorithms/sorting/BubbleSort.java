package datastructure.algorithms.sorting;

public class BubbleSort implements ISorter{

    public void swap(int[] array, int i, int j) {
        if (i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Simple give an array it sorts and returns sorted array
    public int[] sort(int[] arrayIn) {
        int[] userArray = arrayIn;
        for (int lastUnsortedIndex = userArray.length-1; lastUnsortedIndex >0; lastUnsortedIndex--) {
            for(int i =0; i< lastUnsortedIndex; i++){
                if (userArray[i] > userArray[i+1]) {
                    swap(userArray,i,i+1);
                }
            }
        }
        return userArray;
    }

    @Override
    public void print(int[] array) {
        System.out.println("Bubble Sort:");
        for (int val: array){
            System.out.print(val + " ");
        }
        System.out.println();
    }

//    public static void main(String[] args){
//
//        BubbleSort sort = new BubbleSort();
//        int [] intArray = new int[6];
//
//        intArray[0] = 20;
//        intArray[1] = -1;
//        intArray[2] = 22;
//        intArray[3] = 30;
//        intArray[4] = 2;
//        intArray[5] = 9;
//
//        int[] sortedArray = sort.sort(intArray);
//
//        for(int val: sortedArray){
//            System.out.println(val);
//        }
//    }
}
