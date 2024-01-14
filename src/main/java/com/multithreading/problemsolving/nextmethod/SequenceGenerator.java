package com.multithreading.problemsolving.nextmethod;

public class SequenceGenerator {

    private static final Object lock = new Object();

    private static int noOfThreads = 3;
    private static int totalNumbers = 10;
    public static int counter = 1;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Generator(1), "Thread-1");
        Thread t2 = new Thread(new Generator(2), "Thread-2");
        Thread t3 = new Thread(new Generator(0), "Thread-3");
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

    static class Generator implements Runnable {

        private int remainder;

        Generator(int remainder) {
            this.remainder = remainder;
        }

//        @Override
//        public void run() {
//            while (true) {
//                synchronized (lock) {
//                    if (counter > totalNumbers) {
//                        break; // All numbers printed, exit the loop
//                    }
//
//                    // Check if it's the thread's turn to print
//                    if (counter % noOfThreads == remainder) {
//                        System.out.println("Thread " + Thread.currentThread().getName() + ": " + counter);
//                        counter++;
//                    } else {
//                        // Wait for other threads to print their numbers
//                        try {
//                            lock.wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//
//                    // Notify all threads to check the condition again
//                    lock.notifyAll();
//                }
//            }
//
//        }

//                while(counter < totalNumbers-1) {
//                    while (counter % noOfThreads != remainder) {
//                        try {
//                            wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                    System.out.println(Thread.currentThread().getName() + " : " + counter++);
//                    notifyAll();
//                }


        @Override
        public void run() {
            while(counter <= totalNumbers) {
                synchronized (lock) {
                    if (counter % noOfThreads != remainder) {

                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println(Thread.currentThread().getName() + " : " + counter++);
                    }
                    lock.notifyAll();
                }
            }
        }
    }
}
