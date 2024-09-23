package lesson3.vehicles;

public class ElectricCar extends Vehicle {

    private int batteryCapacity;

    public ElectricCar(String model, String license, String color,
                       int year, String ownerName, String insuranceNumber) {
        super(model, license, color, year, ownerName, insuranceNumber, "Electric");
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    String vehicleType() {
        return "Electric Car";
    }

    @Override
    public String toString() {
        return super.toString() + " Battery Capacity: " + batteryCapacity;
    }
}
