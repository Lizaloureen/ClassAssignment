// Interface declaration
interface Vehicle {
    void start(); // Abstract method
}

// Abstract class implementing the interface
abstract class Car implements Vehicle {
    String brand;

    Car(String brand) {
        this.brand = brand;
    }

    // Abstract method (to be implemented by a concrete class)
    abstract void accelerate();

    // Concrete method
    void showBrand() {
        System.out.println("Car brand: " + brand);
    }
}

// Concrete class extending the abstract class
class Sedan extends Car {
    Sedan(String brand) {
        super(brand);
    }

    // Implementing abstract method from Car class
    @Override
    void accelerate() {
        System.out.println(brand + " Sedan is accelerating smoothly.");
    }

    // Implementing method from interface
    @Override
    public void start() {
        System.out.println(brand + " Sedan is starting.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Sedan myCar = new Sedan("Toyota");
        myCar.start();          // Calling interface method implementation
        myCar.accelerate();     // Calling abstract method implementation
        myCar.showBrand();      // Calling concrete method from abstract class
    }
}