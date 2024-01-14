package com.multithreading;

public class MyThread extends Thread {

    @Override
    public void run(){
        System.out.println("thread is running...Rriority is: "
                + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        MyThread nextThread = new MyThread();
        thread.setPriority(Thread.MIN_PRIORITY);
        nextThread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        nextThread.start();
       // nextThread.start(); //cannot be started more than once throws run time exceptions
    }
}
