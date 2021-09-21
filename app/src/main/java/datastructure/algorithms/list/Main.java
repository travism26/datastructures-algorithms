package datastructure.algorithms.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Dawgyg", "NA", 1337));
        employeeList.add(new Employee("No-one", "NA", 1234));
        employeeList.add(new Employee("sup", "homie", 1987));

        employeeList.forEach(employee -> System.out.println(employee.toString()));
    }
}
