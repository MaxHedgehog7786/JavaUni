package lesson8;

public class Racer implements Runnable {
    private int maxSpeed;
    private int boost;
    private int fuelSupply;
    private int refuelingTime;
    private int finishDistance;

    private int currentFuelLevel;
    private int currentSpeed;
    private int stopwatch;
    private int number;
    private int distance;
    private boolean finished;

    public Racer(int maxSpeed, int boost, int fuelSupply, int refuelingTime, int finishDistance, int number) {
        this.maxSpeed = maxSpeed;
        this.boost = boost;
        this.fuelSupply = fuelSupply;
        this.refuelingTime = refuelingTime;
        this.finishDistance = finishDistance;
        this.number = number;
        this.distance = 0;
        this.currentSpeed = 0;
        this.currentFuelLevel = fuelSupply;
        this.stopwatch = 0;
        this.finished = false;
    }

    @Override
    public void run() {
        while (this.distance < this.finishDistance) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.currentSpeed += this.boost;
            this.currentSpeed = Math.min(this.currentSpeed, this.maxSpeed);
            this.stopwatch++;
            this.distance += this.currentSpeed;
            this.currentFuelLevel-=this.currentSpeed;
            this.currentFuelLevel = Math.max(0, this.currentFuelLevel);
            System.out.println("Машина " + this.number + "; Время: " + this.stopwatch + " с; Скорость: " + this.currentSpeed +
                    " м/с; Пройдено: " + this.distance + " м; Запас топлива: " + this.currentFuelLevel+ " м;");
            if (this.currentFuelLevel == 0) {
                for (int i = 0; i < this.refuelingTime; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    this.stopwatch++;
                    System.out.println("Машина " + this.number +" заправляется!" + "Время: " + this.stopwatch + " с;");
                }
                this.currentFuelLevel = fuelSupply;
                this.currentSpeed = 0;
            }
        }
        System.out.println("Машина " +  this.number + " достигла финиша!");
        finished = true;
    }

    public boolean isFinished() {
        return finished;
    }
}
