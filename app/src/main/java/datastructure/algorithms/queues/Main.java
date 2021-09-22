package datastructure.algorithms.queues;

import datastructure.algorithms.list.Employee;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Employee pestily = new Employee("Pestily", "tarkov", 123);
        Employee john = new Employee("john", "sup", 111);
        Employee jane = new Employee("jane", "Mary", 22);
        Employee mike = new Employee("Mike", "Wilson", 233);
        Employee bill = new Employee("Bill", "END", 78);

        ArrayQueue queue = new ArrayQueue(5);
        // Circular Queue Working
//        queue.add(pestily);
//        queue.add(jane);
//        queue.remove();
//        queue.add(john);
//        queue.remove();
//        queue.add(mike);
//        queue.remove();
//        queue.add(bill);
//        queue.remove();
//        queue.add(pestily);


//        queue.add(pestily);
//        System.out.println(queue.peek());
//        queue.add(john);
//        queue.add(jane);
//        queue.add(mike);
//        queue.add(bill);
//        System.out.println("Before Changes");
//        queue.printQueue();
//        queue.remove();
//        queue.remove();
//        System.out.println("removed two from the queue");
//        queue.printQueue();
//        System.out.println("peek:"+ queue.peek());
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.add(mike);
//        System.out.println("One dude left");
//        queue.printQueue();
//        queue.remove();
//        System.out.println("None:");
//        queue.printQueue();

        System.out.println("----------------Palindrome Stack----------------");
        System.out.println(checkForPalindrome("racecar"));
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("was it a car or a cat I saw?"));
        System.out.println(checkForPalindrome("I did, did i?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't nod"));
    }

    // Using Queues and stacks together!
    public static boolean checkForPalindrome(String input) {
        // stack we read right to left: LIFO
        // Queue we read left to right:  FIFO
        // FUN
        // Stack: push(F), push(U), push(N) => NUF
        // Queue: add(F), add(U), add(N) => FUN
        String allowedChars = "abcdefghijklmnopqrstuvwxyz";

        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        String lower = input.toLowerCase();

        for (int i =0; i<input.length(); i++) {
            char c = lower.charAt(i);
            if(allowedChars.indexOf(c) != -1) {
                // allowed add to queue and stack
                queue.addLast(c); // Queues add at the end always
                stack.push(c);  // Stacks are always pushing on top,
                                // kinda like a coin holder the newest coin on top always.
            }
        }

        while(!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }
        return true;
    }
}
