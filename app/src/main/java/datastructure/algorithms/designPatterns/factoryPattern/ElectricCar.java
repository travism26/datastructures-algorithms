package datastructure.algorithms.designPatterns.factoryPattern;

public class ElectricCar implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Push button to start engine");
    }
}
