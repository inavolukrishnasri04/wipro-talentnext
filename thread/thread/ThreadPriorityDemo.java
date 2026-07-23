package com.wipro.thread;

public class ThreadPriorityDemo extends Thread {

    public ThreadPriorityDemo(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(
                getName() + " - Priority: " + getPriority() + " - " + i
            );
        }

        System.out.println(getName() + " completed");
    }

    public static void main(String[] args) {

        ThreadPriorityDemo thread1 =
                new ThreadPriorityDemo("Maximum Priority Thread");

        ThreadPriorityDemo thread2 =
                new ThreadPriorityDemo("Minimum Priority Thread");

        ThreadPriorityDemo thread3 =
                new ThreadPriorityDemo("Normal Priority Thread");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread3.setPriority(Thread.NORM_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}