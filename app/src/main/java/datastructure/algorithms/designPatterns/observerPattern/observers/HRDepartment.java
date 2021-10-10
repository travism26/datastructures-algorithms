package datastructure.algorithms.designPatterns.observerPattern.observers;

import datastructure.algorithms.OOD.hospitalExample.domain.Employee;
import datastructure.algorithms.designPatterns.observerPattern.observers.IObserver;

public class HRDepartment implements IObserver {

    private String name;

    public HRDepartment(String name) {
        this.name = name;
    }

    @Override
    public void callMe(Employee employee, String msg) {
        System.out.println("HR department");
        System.out.println("employee: "+ employee.getName() + ", message:"+msg);
    }


    @Override
    public String getName() {
        return this.name;
    }
}
