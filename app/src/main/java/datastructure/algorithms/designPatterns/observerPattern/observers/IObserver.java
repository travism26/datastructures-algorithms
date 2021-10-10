package datastructure.algorithms.designPatterns.observerPattern.observers;

import datastructure.algorithms.OOD.hospitalExample.domain.Employee;

public interface IObserver {
    public void callMe(Employee employee, String msg);
    public String getName();
}
