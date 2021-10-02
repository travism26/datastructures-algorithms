package datastructure.algorithms.list;

import java.util.LinkedList;

public class DoubleLinkedListExample {

    public static void main(String[] args) {
        Employee jon = new Employee("john", "Doe", 123);
        Employee tim = new Employee("timmy", "SB", 321);
        Employee rick = new Employee("rickjms", "jms", 1337);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(jon);
        list.addFirst(tim);
        list.addFirst(rick);
        int[] A = new int[1];
        int t = A.length;
    }
}
