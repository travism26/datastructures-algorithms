package datastructure.algorithms.designPatterns.factoryPattern;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Start da car homeie");
    }
}
