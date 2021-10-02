package datastructure.algorithms.OOD.manufactureExample.processes;

public class SmartPhoneManufacturingProcess extends GeneralManufacturingProcess {
    public SmartPhoneManufacturingProcess(String deviceName) {
        super(deviceName);
    }

    // smart phone assembly actions

    private void AttachScreen() {
        System.out.println("Attaching screen");
    }
    // ... etc

    @Override
    public void assembly() {
        System.out.println("assembling smartphone");
        AttachScreen();
    }

    // smartphone test actions here
    private void testPhone() {
        System.out.println("Turn on phone and check screen");
    }
    //... etc

    @Override
    public void testing() {
        System.out.println("testing smartphone");
        testPhone();
    }

    @Override
    public void packaging() {
        System.out.println("package smartphone");
    }

    @Override
    public void storage() {
        System.out.println("store smartphone");
    }
}
