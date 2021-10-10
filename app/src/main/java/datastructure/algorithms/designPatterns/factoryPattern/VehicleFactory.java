package datastructure.algorithms.designPatterns.factoryPattern;

public class VehicleFactory {
    public Vehicle getVehicle(VehicleType vehicleType) {
            // This seems simple however, sometimes creating objects can be complex.
            // we would usually put all the object creation logic in here.
        return vehicleType.getVehicle();
    }
}
