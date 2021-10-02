package datastructure.algorithms.OOD.hospitalExample.domain;

public class Nurse extends Employee {
    public Nurse(long id, String name, String department, boolean working) {
        super(id, name, department, working);
    }

    @Override
    public void performDuties() {
        System.out.println("Do nurse related work...");
    }
}
