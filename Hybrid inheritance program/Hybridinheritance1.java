class Vehicle {
    String brand;
    Vehicle(String brand) {
        this.brand = brand;
    }
    void showBrand() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Car extends Vehicle {
    int numberOfDoors;
    Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }
    void drive() {
        System.out.println(brand + " car is driving.");
    }
}

interface Chargeable {
    void chargeBattery();
}

class ElectricCar extends Car implements Chargeable {
    int batteryCapacity;
    ElectricCar(String brand, int numberOfDoors, int batteryCapacity) {
        super(brand, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
    }
    public void chargeBattery() {
        System.out.println(brand + " electric car is charging with " + batteryCapacity + " kWh battery.");
    }
}

public class Hybridinheritance1 {
    public static void main(String[] args) {
        ElectricCar e1 = new ElectricCar("Tesla", 4, 100);
        e1.showBrand();
        e1.drive();
        e1.chargeBattery();
    }
}
