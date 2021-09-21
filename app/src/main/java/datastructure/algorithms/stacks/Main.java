package datastructure.algorithms.stacks;

import datastructure.algorithms.list.Employee;

public class Main {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Pestily", "tarkov", 123));
        stack.push(new Employee("john", "sup", 111));
        stack.push(new Employee("jane", "Mary", 22));
        stack.push(new Employee("Mike", "Wilson", 233));
        stack.push(new Employee("Bill", "END", 78));

        stack.printStack();
        System.out.println("Peek:"+ stack.peek());
        System.out.println("pop: "+ stack.pop());
        System.out.println("Peek: "+ stack.peek());
    }
}
