package datastructure.algorithms.OOD.remoteControl;

public class Projector implements devices {
    @Override
    public void turnOn() {
        System.out.println("Turn on the projector");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn OFF the projector");
    }
}
