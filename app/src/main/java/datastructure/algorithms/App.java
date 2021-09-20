/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package datastructure.algorithms;

import datastructure.algorithms.sorting.*;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        ArrayList<ISorter> sortingAlgorithms = new ArrayList<>();
        sortingAlgorithms.add(new BubbleSort());
        sortingAlgorithms.add(new SelectionSort());
        sortingAlgorithms.add(new InsertionSort());
        sortingAlgorithms.add(new ShellSort());
        sortingAlgorithms.add(new MergeSort());
        sortingAlgorithms.add(new QuickSort());

//        System.out.println(new App().getGreeting());

        for(ISorter sorter: sortingAlgorithms){
            int[] intArray = {20, 35, -15, 7, 55, 1, -22};
            sorter.sort(intArray);
            sorter.print(intArray);
        }


//        Arrays.parallelSort(intArray);
    }
}
