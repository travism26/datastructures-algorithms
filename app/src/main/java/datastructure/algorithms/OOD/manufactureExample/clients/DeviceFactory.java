package datastructure.algorithms.OOD.manufactureExample.clients;

import datastructure.algorithms.OOD.manufactureExample.processes.GeneralManufacturingProcess;
import datastructure.algorithms.OOD.manufactureExample.processes.SmartPhoneManufacturingProcess;

public class DeviceFactory {

    public static void main(String[] args) {
        GeneralManufacturingProcess manfacturer = new SmartPhoneManufacturingProcess("IPhone");
        manfacturer.launchProcess();
    }
}
