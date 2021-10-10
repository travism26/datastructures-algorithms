package datastructure.algorithms.designPatterns.factoryPattern;

public enum VehicleType {
    Truck{
        public Vehicle getVehicle(){
            return new Truck();
        }
    },
    CAR{
        public Vehicle getVehicle(){
            return new Car();
        }
    },
    ELECTRIC{
        public Vehicle getVehicle(){
            return new ElectricCar();
        }
    };

    abstract Vehicle getVehicle();
}
