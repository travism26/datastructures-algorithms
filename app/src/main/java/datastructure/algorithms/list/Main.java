package datastructure.algorithms.list;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Dawgyg", "NA", 1337));
        employeeList.add(new Employee("No-one", "NA", 1234));
        employeeList.add(new Employee("sup", "homie", 1987));

//        employeeList.forEach(employee -> System.out.println(employee.toString()));

        System.out.println(employeeList.isEmpty());
        employeeList.set(1, new Employee("Updated", "User", 1234));
//        employeeList.forEach(employee -> System.out.println(employee.toString()));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

//        for (Employee employee : employeeArray) {
//            System.out.println(employee);
//        }

        // Need to implement the equals method in the employee class else this will be false.
//        System.out.println(employeeList.contains(new Employee("Dawgyg", "NA", 1337)));
//        System.out.println(employeeList.indexOf(new Employee("Dawgyg", "NA", 1337)));

        System.out.println("---------------LINKED LIST EXAMPLE---------------");
        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println(list.isEmpty());
        Employee jes = new Employee("jes","sb", 321);
        Employee tony = new Employee("tonys","pizza", 1337);
        Employee kevin = new Employee("pestily","sb", 32111);
        Employee sb = new Employee("sb","tv", 44332);
        list.addToFront(jes);
        list.addToFront(tony);
        list.addToFront(kevin);
        list.addToFront(sb);
        System.out.println(list.getSize());
        list.printList();
        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

        System.out.println("---------------Intersect Example---------------");
        int[] intersectOne = {1,2,2,3,1,2,1};
        int[] intersectTwo = {0,2,2,3};
        intersect(intersectOne, intersectTwo);
    }

    public static void intersect(int[] arrayOne, int[] arrayTwo) {

        HashMap<Integer, Integer> occurrences = new HashMap<>();
        for (int i = 0; i<arrayOne.length; i++){
            int value = arrayOne[i];
            int count = occurrences.getOrDefault(value, 0); // get the value at i or set 0
            occurrences.put(value, ++count); // increment the value
        }
        System.out.println(occurrences.toString());

        ArrayList<Integer> intersect = new ArrayList<>();
        for (int i = 0; i< arrayTwo.length; i++) {
            int value = arrayTwo[i];
            int count = occurrences.getOrDefault(value, 0);
            if (count > 0) {
                intersect.add(value);
                occurrences.put(value, --count);
            }
        }

        System.out.println("\nIntersection");
        for(int val: intersect){
            System.out.print(val+", ");
        }
    }
}
