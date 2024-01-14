package com.runtime;

public class RuntimeTest {
    static class Message extends Thread {

        @Override
        public void run() {
            System.out.println(" Exit");
        }
    }

    public static void main(String[] args) {
        try {
            Runtime.getRuntime().addShutdownHook(new Message());
            System.out.println(" Program Started...");
            System.out.println(" Wait for 5 seconds...");
            Thread.sleep(5000);
            System.out.println(" Program Ended...");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
