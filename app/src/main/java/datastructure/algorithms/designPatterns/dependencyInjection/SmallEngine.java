package datastructure.algorithms.designPatterns.dependencyInjection;

public class SmallEngine implements Engine{

    private int horsePower;

    public SmallEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void startEngine() {
        System.out.println("Started Small "+ this.horsePower + "hp engine");
    }
}
