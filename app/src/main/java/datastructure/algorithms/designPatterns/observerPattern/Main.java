package datastructure.algorithms.designPatterns.observerPattern;

import datastructure.algorithms.OOD.hospitalExample.domain.Nurse;
import datastructure.algorithms.designPatterns.observerPattern.observers.HRDepartment;
import datastructure.algorithms.designPatterns.observerPattern.observers.IObserver;
import datastructure.algorithms.designPatterns.observerPattern.observers.PayrollDepartment;
import datastructure.algorithms.designPatterns.observerPattern.subject.EmployeeManagementSystem;

public class Main {

    // subject maintains a list and calls the observer methods to notify all observers.

    public static void main(String[] args) {
        System.out.println("Test ems");
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        IObserver hrdepartment = new HRDepartment("HR Department");
        IObserver payroll = new PayrollDepartment("Payroll department");

        ems.registerObserver(hrdepartment);
        ems.registerObserver(payroll);

        ems.hireNewEmployee(new Nurse(4, "Mary", "HR Department", true));
        
        ems.modifyEmployeeName(4, "Lary");
    }
}
