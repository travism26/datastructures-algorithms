package datastructure.algorithms.stacks;

import datastructure.algorithms.list.Employee;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------------Array Stack----------------");
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

        System.out.println("----------------Linked Stack----------------");
        Employee pestily = new Employee("Pestily", "tarkov", 123);
        Employee john = new Employee("john", "sup", 111);
        Employee jane = new Employee("jane", "Mary", 22);
        Employee mike = new Employee("Mike", "Wilson", 233);
        Employee bill = new Employee("Bill", "END", 78);

        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(pestily);
        linkedStack.push(john);
        linkedStack.push(jane);
        linkedStack.push(mike);
        linkedStack.push(bill);

        linkedStack.printStack();
        System.out.println("Peek:"+ linkedStack.peek());
        System.out.println("Pop:"+ linkedStack.pop());
        linkedStack.printStack();
    }
}
