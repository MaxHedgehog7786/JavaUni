package lesson3.app;

import lesson3.vehicles.Car;
import lesson3.vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setOwnerName("Max");
        car.setEngineType("Internal combustion engine");
        System.out.println(car.getOwnerName());
        System.out.println(car.getEngineType());
        ElectricCar electricCar = new ElectricCar();
        electricCar.setBatteryCapacity(77);
        System.out.println(electricCar.getBatteryCapacity());
        System.out.println(electricCar.getEngineType());
    }
}
