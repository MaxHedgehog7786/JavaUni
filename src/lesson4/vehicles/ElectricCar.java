package lesson4.vehicles;

public class ElectricCar extends Car implements ElectricVehicle{

    private int batteryCapacity = 100;

    public ElectricCar(String model, String license, String color, int year, String ownerName,
                       String insuranceNumber) {
        super(model, license, color, year, ownerName, insuranceNumber);
        this.setEngineType("Electric");
    }

    @Override
    public int getBatteryCapacity() {
        return this.batteryCapacity;
    }

    @Override
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
