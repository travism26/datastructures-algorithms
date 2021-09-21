package datastructure.algorithms.stacks;

import datastructure.algorithms.list.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private LinkedList<Employee> stack;

    public LinkedStack() {
        stack = new LinkedList<>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
/*
 * why do this?
 *    We did this so our users are forced to use the methods we listed above, if we accessed the 'LinkedList'
 * directly we would be giving developers potentially additional unwanted functionality within that class.
 * the 'LinkedList' class implements: List<E>, Deque<E>, Cloneable, java.io.Serializable
 * Given above interfaces if we "Wrap" or limit our LinkedStack to only contain 5 methods above,
 * we have more control on what users / devs can and cant do.
 */
}
