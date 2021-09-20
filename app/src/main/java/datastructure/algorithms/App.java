/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package datastructure.algorithms;

import datastructure.algorithms.sorting.*;

import java.util.ArrayList;

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

//        System.out.println(new App().getGreeting());
        int [] intArray = new int[6];

        intArray[0] = 20;
        intArray[1] = -1;
        intArray[2] = 22;
        intArray[3] = 30;
        intArray[4] = 2;
        intArray[5] = 9;
        for(ISorter sorter: sortingAlgorithms){
            sorter.sort(intArray);
            sorter.print(intArray);
        }

    }
}
