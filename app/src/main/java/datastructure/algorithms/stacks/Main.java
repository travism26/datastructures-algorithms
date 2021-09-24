package datastructure.algorithms.stacks;

import datastructure.algorithms.list.Employee;

import java.util.LinkedList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

//        System.out.println("----------------Array Stack----------------");
//        ArrayStack stack = new ArrayStack(10);
//        stack.push(new Employee("Pestily", "tarkov", 123));
//        stack.push(new Employee("john", "sup", 111));
//        stack.push(new Employee("jane", "Mary", 22));
//        stack.push(new Employee("Mike", "Wilson", 233));
//        stack.push(new Employee("Bill", "END", 78));
//
//        stack.printStack();
//        System.out.println("Peek:"+ stack.peek());
//        System.out.println("pop: "+ stack.pop());
//        System.out.println("Peek: "+ stack.peek());
//
//        System.out.println("----------------Linked Stack----------------");
        Employee pestily = new Employee("Pestily", "tarkov", 123);
        Employee john = new Employee("john", "sup", 111);
        Employee jane = new Employee("jane", "Mary", 22);
        Employee mike = new Employee("Mike", "Wilson", 233);
        Employee bill = new Employee("Bill", "END", 78);
//
//        LinkedStack linkedStack = new LinkedStack();
//        linkedStack.push(pestily);
//        linkedStack.push(john);
//        linkedStack.push(jane);
//        linkedStack.push(mike);
//        linkedStack.push(bill);
//
//        linkedStack.printStack();
//        System.out.println("Peek:"+ linkedStack.peek());
//        System.out.println("Pop:"+ linkedStack.pop());
//        linkedStack.printStack();
//
//        System.out.println("----------------Palindrome Stack----------------");
//        System.out.println(checkForPalindrome("racecar"));
//        System.out.println(checkForPalindrome("abccba"));
//        System.out.println(checkForPalindrome("was it a car or a cat I saw?"));
//        System.out.println(checkForPalindrome("I did, did i?"));
//        System.out.println(checkForPalindrome("Don't nod"));
//        System.out.println(checkForPalindrome("hello"));
        LinkedList<Employee> entry = new LinkedList<>();
        LinkedList<Employee> exit = new LinkedList<>();
        EmployeeQueue testQueue = new EmployeeQueue(entry, exit);
        testQueue.enqueue(pestily);
        testQueue.printEnqueue();
        System.out.println("Add bill");
        testQueue.enqueue(bill);
        testQueue.printEnqueue();
        System.out.println("Dequeue:"+ testQueue.dequeue());
        testQueue.printEnqueue();
    }

    public static boolean checkForPalindrome(String input) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz";

        String lowerCase = input.toLowerCase();
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder stringNoPunctuation = new StringBuilder(input.length());

        for (int i = 0; i<lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            // if the indexOf(c) fails it returns -1 -> char does not exist in string.
            if (allowedChars.indexOf(c) != -1) {
                // allowed char
                stringNoPunctuation.append(c);
                stack.push(c);
            } else {
                // NOT Allowed, the char passed does NOT exist in the allow list.
            }
        }

        StringBuilder reverseString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }

        return reverseString.toString().equals(stringNoPunctuation.toString());
    }
}
