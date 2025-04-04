class Vehicle {
    void fuel() {
        System.out.println("Vehicle needs fuel.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Driving a car...");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Riding a bike...");
    }
}

public class HierarchicalInheritance1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.fuel();
        car.drive();

        Bike bike = new Bike();
        bike.fuel();
        bike.ride();
    }
}
