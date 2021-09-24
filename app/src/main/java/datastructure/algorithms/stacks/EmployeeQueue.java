package datastructure.algorithms.stacks;

import datastructure.algorithms.list.Employee;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeQueue {
    private LinkedList<Employee> entryStack, exitStack;

    public EmployeeQueue(LinkedList<Employee> entryStack, LinkedList<Employee> exitStack) {
        this.entryStack = entryStack;
        this.exitStack = exitStack;
    }

    public void enqueue(Employee employee) {
        this.entryStack.push(employee);
    }
    //avl & red black tree
    public Employee dequeue() {
        if (exitStack.isEmpty()) {
            if (this.entryStack.isEmpty()) {
                throw new EmptyStackException(); // if both are empty throw an error
            }
            else {
                while(!this.entryStack.isEmpty()) {
                    this.exitStack.push(this.entryStack.pop()); // pop all the items off the entry queue
                }
            }
        }
        return exitStack.pop(); // pop off the exit queue and return employee
    }

    public void printEnqueue() {
        for (Employee employee : this.entryStack) {
            System.out.println(employee);
        }
    }
}
