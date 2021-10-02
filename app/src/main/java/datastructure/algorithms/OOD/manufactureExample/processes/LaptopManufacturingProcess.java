package datastructure.algorithms.OOD.manufactureExample.processes;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess {
    public LaptopManufacturingProcess(String deviceName) {
        super(deviceName);
    }

    @Override
    public void assembly() {
        System.out.println("Assemble laptop");
    }

    @Override
    public void testing() {
        System.out.println("test laptop");
    }

    @Override
    public void packaging() {
        System.out.println("package laptop");
    }

    @Override
    public void storage() {
        System.out.println("store laptop");
    }
}
