package datastructure.algorithms.OOD.remoteControl;

public class TV implements devices{
    @Override
    public void turnOn() {
        System.out.println("Turn on the TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the TV");
    }
}
