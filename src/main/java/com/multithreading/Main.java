package com.multithreading;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Runnable daemonRunnable = () -> {
            while (true) {
                System.out.println("I'm a daemon thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable userRunnable = () -> {
            try {
                System.out.println("I'm a user thread");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread daemonThread = new Thread(daemonRunnable);
        daemonThread.setName("daemon-thread");
        daemonThread.setDaemon(true);
        Thread notDaemonThread = new Thread(userRunnable);
        notDaemonThread.setName("not-daemon-thread");
        daemonThread.start();
        notDaemonThread.start();
        Thread.sleep(4000);
    }
}