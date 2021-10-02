package datastructure.algorithms.OOD.hospitalExample.domain;

public class Doctor extends Employee {
    public Doctor(long id, String name, String department, boolean working) {
        super(id, name, department, working);
    }

    @Override
    public void performDuties() {
        System.out.println("Do doctor related stuff...");
    }
}
