package lesson3.vehicles;

public class Car extends Vehicle {


    public Car(String model, String license, String color, int year, String ownerName,
               String insuranceNumber) {
        super(model, license, color, year, ownerName, insuranceNumber, "ICE");
    }

    @Override
    String vehicleType() {
        return "Car";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
