package com.multithreading;

public class MyNewThread implements Runnable {

    @Override
    public void run() {
        System.out.println("threads running 123....");
    }

    public static void main(String[] args) {
       Thread thread = new Thread(new MyNewThread());
       thread.start();
    }
}
