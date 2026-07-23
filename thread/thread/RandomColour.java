package com.wipro.thread;

import java.util.Random;

public class RandomColour implements Runnable {

    private final String[] colours = {
        "white", "blue", "black", "green", "red", "yellow"
    };

    @Override
    public void run() {

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);
            String colour = colours[index];

            System.out.println(colour);

            if (colour.equals("red")) {
                System.out.println("Red colour generated. Thread stopped.");
                break;
            }
        }
    }

    public static void main(String[] args) {

        RandomColour task = new RandomColour();

        Thread thread = new Thread(task);

        thread.start();
    }
}