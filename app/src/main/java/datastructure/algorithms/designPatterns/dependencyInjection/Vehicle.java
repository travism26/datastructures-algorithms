package datastructure.algorithms.designPatterns.dependencyInjection;

public class Vehicle {

    // Problem here!!! we are hard coding the engine dependency here
    // what if we wanted to change the engine type? we would need to come into
    // this class and mod it.
//    Engine racingEngine = new LargeEngine(500);

    // better way
    Engine myEngine;

    // this expects a living object as an argument
    public Vehicle(Engine myEngine) {
        this.myEngine = myEngine;
    }

    public void crankIgnition() {
        myEngine.startEngine();
        System.out.println("Vehicle is running");
    }

}
