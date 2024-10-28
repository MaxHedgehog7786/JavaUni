package lesson8;

public class Main {
    public static void main(String[] args) {
        Racer racer1 = new Racer(50, 5, 200, 3, 500, 1);  // (maxSpeed, boost, fuelSupply, refuelingTime, finishDistance, number)
        Racer racer2 = new Racer(60, 6, 200, 2, 500, 2);  // параметры можно настраивать

        Race race = new Race(racer1, racer2);
        race.startRace();
    }
}
