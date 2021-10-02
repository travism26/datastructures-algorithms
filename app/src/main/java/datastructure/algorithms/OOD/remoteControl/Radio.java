package datastructure.algorithms.OOD.remoteControl;

public class Radio implements devices{
    @Override
    public void turnOn() {
        System.out.println("Turn on the radio");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the radio");
    }
}
