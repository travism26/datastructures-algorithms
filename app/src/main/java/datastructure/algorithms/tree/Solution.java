package datastructure.algorithms.tree;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        Solution n = new Solution();
        int[] ss = {1, 3, 6, 4, 1, 2};
        System.out.println("Missing:"+n.solution(ss));

        int[] test = {2, 1, -1, -3, 5};
        n.findSumOfThree(test);

    }

    // Find the sum of three values that equal 0
    public void findSumOfThree(int[] input) {
        //                       i start       end
        //                       |  |          |
        // given an input array [1, 2, -1, -3, 5]
        //                       |    |        |
        // Sort                 [-3, -1, 1, 2, 5]
        // first pass: -3 + -1 + 5 = 1 -> Move end --
        // second pass:-3 + -1 + 2 = -2 -> Move start++
        // 3rd pass   :-3 + 1 + 2 = 0 -> return 3 values
        // add three values that will create the sum of 0
        int[] sortedInput = input;
        Arrays.sort(sortedInput);
        int start=0, end=sortedInput.length-1;
        for (int i=0; i<sortedInput.length; i++) {
            start=i+1; // always start at the point after i
            end=sortedInput.length-1; // always point at the end of the array
            while(start < end) {
                int currentSum = sortedInput[i] + sortedInput[start] + sortedInput[end];
                if (currentSum > 0){
                    end--;
                } else if (currentSum < 0) {
                    start++;
                } else {
                    System.out.println("i:"+ sortedInput[i] + " start:"+ sortedInput[start]+ " end:"+ sortedInput[end]);
                    return;
                }
            }
        }
        System.out.println("None available");
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] sortedList = A;


        // sort the array make it easier to deal with O(nlogn) time complexity
        Arrays.sort(sortedList); // this uses quicksort with double pivot
        for (int v : sortedList) {
            System.out.println(v);
        }
        // ignore negative numbers
        //   1, 1, 2, 3, 4, 6
        //  [1, 3, 6, 4, 1, 2]

        // find first positive value index and start there
        // [-1, -2, -3, -4, -5, 2] => returns 1 worst cast would be O(n) doing linear search
        int currentSmallest = -1;
        int largest = sortedList[A.length-1];
        System.out.println("LAR:"+largest);
        // if the largest value is negative return 1
        if(largest <= 0) {
            System.out.println("TESTSSS");
            return 1;
        }

        int[] countArray = new int[largest+1]; // get the largest value.
        for (int i =0; i<sortedList.length; i++) {
            if(sortedList[i] <= 0) {
                // if negative skip
            } else {
                // add value to the count array
                countArray[sortedList[i]] = 1;
            }
        }

        for(int i=1; i<countArray.length; i++) {
            System.out.println(countArray[i]);
            if(countArray[i] == 0) {
                return i;
            }
        }
        return 1;
    }
}
