package datastructure.algorithms.designPatterns.observerPattern.observers;

import datastructure.algorithms.OOD.hospitalExample.domain.Employee;
import datastructure.algorithms.designPatterns.observerPattern.observers.IObserver;

public class PayrollDepartment implements IObserver {

    private String name;

    public PayrollDepartment(String name) {
        this.name = name;
    }

    @Override
    public void callMe(Employee employee, String msg) {
        System.out.println("Payroll department");
        System.out.println("employee: "+ employee.getName() + ", message:"+msg);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
