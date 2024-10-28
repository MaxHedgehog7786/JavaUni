package lesson8;

public class Race {
    private Racer racer1;
    private Racer racer2;
    private Thread racer1Thread;
    private Thread racer2Thread;

    public Race(Racer racer1, Racer racer2) {
        this.racer1 = racer1;
        this.racer2 = racer2;
    }

    public void startRace() {
        racer1Thread = new Thread(racer1);
        racer2Thread = new Thread(racer2);

        racer1Thread.start();
        racer2Thread.start();

        Thread timerThread = new Thread(() -> {
            while (!racer1.isFinished() && !racer2.isFinished()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
            if (racer1.isFinished() && racer2.isFinished()) {
                System.out.println("Гонка завершена! Оба гонщика достигли финиша.");
            } else if (racer1.isFinished()) {
                System.out.println("Гонка завершена! Победила машина 1.");
            } else {
                System.out.println("Гонка завершена! Победила машина 2.");
            }
            System.exit(1);
        });


        timerThread.start();
    }
}
