package com.wipro.thread;

public class EvenOddThreads {

    public static void main(String[] args) {

        Thread evenThread = new Thread(new Runnable() {

            @Override
            public void run() {

                System.out.println("Even numbers:");

                for (int i = 2; i <= 20; i += 2) {
                    System.out.println(i);
                }
            }
        });

        Thread oddThread = new Thread(new Runnable() {

            @Override
            public void run() {

                System.out.println("Odd numbers:");

                for (int i = 1; i <= 20; i += 2) {
                    System.out.println(i);
                }
            }
        });

        evenThread.start();

        try {
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        oddThread.start();
    }
}