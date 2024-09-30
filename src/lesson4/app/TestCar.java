package lesson4.app;

import lesson4.vehicles.Car;
import lesson4.vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Kia Rio", "ABC999FFF", "Gold", 2010,
                "Maxim Mikhalishin", "OSAGO222777111");

        ElectricCar ecar = new ElectricCar("Zeekr 001", "HQWVUH12794731289", "Orange",
                2024, "Alex Burencheff", "KASKO000111222");

        car.setYear(2011);
        ecar.setYear(2025);
        car.setOwnerName("Artyom Petrosyanc");
        ecar.setOwnerName("Nikhavana Stiv");
        car.setInsuranceNumber("ABOBA3445");
        ecar.setInsuranceNumber("AAANEGR69");
        System.out.println(ecar.getBatteryCapacity());
        System.out.println(car);
        System.out.println(ecar);

    }
}
