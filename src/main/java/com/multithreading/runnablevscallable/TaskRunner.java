package com.multithreading.runnablevscallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskRunner {

    private static ExecutorService executorService;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        executeTask();
    }

    private static void executeTask() throws ExecutionException, InterruptedException {
        executorService= Executors.newSingleThreadExecutor();
        EventLoggingTask task = new EventLoggingTask();
        Future future = executorService.submit(task);
        System.out.println("future values" + future);
        executorService.shutdown();
    }
}
