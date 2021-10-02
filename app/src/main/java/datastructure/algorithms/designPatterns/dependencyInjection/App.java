package datastructure.algorithms.designPatterns.dependencyInjection;

public class App {

    public static void main(String[] args) {

        Vehicle racecar = new Vehicle(new SmallEngine(100)); // this is dependency injection we are injecting the object.
        Vehicle sup = new Vehicle(new LargeEngine(500));

        sup.crankIgnition();

        racecar.crankIgnition(); // <-- This has a hard dependency on LargeEngine.java
    }
}
