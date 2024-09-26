package lesson3.app;

import lesson3.vehicles.Car;
import lesson3.vehicles.ElectricCar;

public class TestCar {

    public static void main(String[] args) {
        Car car = new Car("Kia Stinger", "ABC999FNIW1",
                "Black", 2024, "Maxim Mikhalishin", "АА111А");

        ElectricCar ecar = new ElectricCar("Tesla Cybertruck", "VUWNVU13901209F", "White",
                2024, "Maxim Mikhalishin", "ЭЭ999Э");

        ecar.setBatteryCapacity(100);

        System.out.println(car);
        System.out.println(ecar);

    }


}
