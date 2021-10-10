package datastructure.algorithms.designPatterns.factoryPattern;

public class App {

    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        Vehicle car = factory.getVehicle(VehicleType.CAR);
        car.startEngine();
    }
}
