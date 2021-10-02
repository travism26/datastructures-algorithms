package datastructure.algorithms.OOD.remoteControl;

public final class RemoteControl {

    private static volatile RemoteControl instance = null;

    private RemoteControl() {}
    private static devices connectedDevice;

    public static RemoteControl getInstance() {
        if (instance == null) {
            synchronized (RemoteControl.class) {
                if (instance == null) {
                    instance = new RemoteControl();
                }
            }
        }
        return  instance;
    }

    public static devices connect(devices device) {
        connectedDevice = device;
        return connectedDevice;
    }

    public void turnOn() {
        connectedDevice.turnOn();
    }

    public void turnOff(){
        connectedDevice.turnOff();
    }

    public static void main(String[] args) {
        RemoteControl controller = new RemoteControl();
        Radio r1 = new Radio();
        TV tv = new TV();
        Projector projector = new Projector();

        controller.connect(r1);
        controller.turnOn();
        controller.connect(tv);
        controller.turnOff();

        controller.connect(projector);
        controller.turnOn();
        controller.turnOff();



    }

}
