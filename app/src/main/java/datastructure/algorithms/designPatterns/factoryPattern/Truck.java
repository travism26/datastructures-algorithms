package datastructure.algorithms.designPatterns.factoryPattern;

public class Truck implements Vehicle
{
    @Override
    public void startEngine() {
        System.out.println("Start truck");
    }
}
