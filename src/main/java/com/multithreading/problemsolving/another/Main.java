package com.multithreading.problemsolving.another;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        int maxNumber = 6;
        Thread t1 = new Thread(new PrintThread(1, maxNumber), "Thread- 1");
        Thread t2 = new Thread(new PrintThread(2, maxNumber), "thread- 2");
        Thread t3 = new Thread(new PrintThread(0, maxNumber), "thread- 3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class PrintThread implements Runnable {
    private static final Semaphore semaphore = new Semaphore(1);
    private static int currentNumber = 1;
    private int threadId;
    private int maxNumber;

    public PrintThread(int threadId, int maxNumber) {
        this.threadId = threadId;
        this.maxNumber = maxNumber;
    }

    @Override
    public void run() {
        while (currentNumber <= maxNumber) {
            try {
                semaphore.acquire();
                if (currentNumber % 3 == threadId) {
                    System.out.println( Thread.currentThread().getName() + " : "+ currentNumber);
                    currentNumber++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }
    }
}
