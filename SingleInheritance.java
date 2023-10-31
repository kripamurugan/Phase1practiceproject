package corejavapracticeproject;
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car is accelerating");
    }

    void brake() {
        System.out.println("Car is braking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        
        myCar.start();       
        myCar.accelerate();  
        myCar.brake();       
        myCar.stop();        
    }
}
