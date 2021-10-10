package datastructure.algorithms.designPatterns.BuilderPattern;

public class App {

    public static void main(String[] args) {
        // this is similar to decorator pattern
        User websiteUser = new User.Builder("rickjma", "rickjms.something@gmail.com").firstName("r").build();
        System.out.println(websiteUser.toString());

        Vehicle testcar = new Vehicle.Builder()
                .color("red")
                .doors(4)
                .horsePower(250)
                .make("Tesla").build();

        System.out.println(testcar.toString());
    }
}
