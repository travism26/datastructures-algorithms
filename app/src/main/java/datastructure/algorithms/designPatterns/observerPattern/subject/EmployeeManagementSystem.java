package datastructure.algorithms.designPatterns.observerPattern.subject;

import datastructure.algorithms.OOD.hospitalExample.domain.Employee;
import datastructure.algorithms.designPatterns.observerPattern.observers.IObserver;
import datastructure.algorithms.designPatterns.observerPattern.subject.ISubject;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements ISubject {
    private List<Employee> employees;
    private List<IObserver> observers;
    private Employee employee;
    private String message;

    public EmployeeManagementSystem() {
        this.employees = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void notifyAllDepartments(Employee employee, String message) {
        for (IObserver observer: observers) {
            observer.callMe(employee, message);
        }
    }

    public void hireNewEmployee(Employee employee) {
        this.employee = employee;
        this.message = "Hire new employee";
        this.employees.add(employee);
        notifyAllDepartments(this.employee, message);
    }

    public void modifyEmployeeName(int id, String newName) {
        boolean notify = false;

        for (Employee emp : employees) {
            if (id == emp.getId()) {
                String oldName = emp.getName();
                emp.setName(newName);
                this.employee = emp;
                this.message = "Employee name change:"+oldName+"->"+newName;
                notify = true;
            }

            if (notify){
                notifyObservers();
            }
        }
    }

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer: observers) {
            observer.callMe(employee, message);
        }
    }
}
