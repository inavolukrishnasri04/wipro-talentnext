package com.wipro.thread;

public class ThreadNames {

    public static void main(String[] args) {

        Thread thread1 = new Thread();
        Thread thread2 = new Thread();

        thread1.setName("Scooby");
        thread2.setName("Shaggy");

        System.out.println("First thread name: " + thread1.getName());
        System.out.println("Second thread name: " + thread2.getName());
    }
}