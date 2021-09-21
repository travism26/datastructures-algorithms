package datastructure.algorithms.stacks;

import datastructure.algorithms.list.Employee;

import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    private int top; // top = 0; the stack is empty.

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == stack.length) {
            // array is full, resize it, and copy over the old `stack` over to the
            // new stack and assign old stack to the new stack (newArray)
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = employee;
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public Employee peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public void printStack() {
        for(int i = top - 1; i>=0; i--) {
            System.out.println(stack[i]);
        }
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
