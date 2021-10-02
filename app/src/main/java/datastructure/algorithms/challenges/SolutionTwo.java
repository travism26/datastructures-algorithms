package datastructure.algorithms.challenges;

import java.util.ArrayList;

public class SolutionTwo {

    public static void main(String[] args) {
        int test = -125345;

        System.out.println(Integer.toString(test));

        String input = Integer.toString(test);
        ArrayList<Integer> outputs = new ArrayList<>();
        for (int i=0; i<input.length(); i++) {
            StringBuilder userIn = new StringBuilder(input);
            System.out.println(userIn.charAt(i));
            String curr = Character.toString(userIn.charAt(i));
            if(curr.equals("5")) {
                // string remove charat i
                userIn.deleteCharAt(i);
                outputs.add(Integer.parseInt(userIn.toString()));
            } else {
                // skip here
            }
        }
        System.out.println(outputs);
//        System.out.println(userIn);
    }
}
