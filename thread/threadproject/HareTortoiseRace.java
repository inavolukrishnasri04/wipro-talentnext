package com.wipro.threadproject;

class RaceThread extends Thread {

    private static boolean raceFinished = false;

    public RaceThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {

            if (raceFinished) {
                return;
            }

            System.out.println(getName() + " : " + i + " meters");

            // Hare sleeps after reaching 60 meters
            if (getName().equals("Hare") && i == 60) {
                try {
                    System.out.println("Hare is sleeping for 1 second...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i == 100 && !raceFinished) {
                raceFinished = true;
                System.out.println();
                System.out.println("*****************************");
                System.out.println(getName() + " wins the race!");
                System.out.println("*****************************");
            }
        }
    }
}

public class HareTortoiseRace {

    public static void main(String[] args) {

        RaceThread hare = new RaceThread("Hare");
        RaceThread tortoise = new RaceThread("Tortoise");

        // Hare has higher priority
        hare.setPriority(Thread.MAX_PRIORITY);

        // Tortoise has normal priority
        tortoise.setPriority(Thread.NORM_PRIORITY);

        hare.start();
        tortoise.start();
    }
}