package com.multithreading.runnablevscallable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.Assert.assertEquals;

public class FactorialTaskManualTest {

    private ExecutorService executorService;

    @Before
    public void setup(){
        executorService = Executors.newSingleThreadExecutor();
    }

    @Test
    public void whenTaskSubmitted_ThenFutureResultObtained() throws ExecutionException, InterruptedException {
        FactorialTask task = new FactorialTask(5);
        Future<Integer> future= executorService.submit(task);
        assertEquals(120,future.get().intValue());
    }

    @Test(expected = ExecutionException.class)
    public void whenException_ThenCallableThrowsIt() throws InterruptedException, ExecutionException {
       try {
           FactorialTask task = new FactorialTask(-5);
           Future<Integer> future = executorService.submit(task);
           Integer result = future.get().intValue();
       }catch (ExecutionException ex){
           System.out.println(ex.getCause());
           System.out.println(ex.getMessage());
       }catch (InterruptedException ex){
           System.out.println(ex.getCause());
           System.out.println(ex.getMessage());
       }

    }

    @Test
    public void whenException_ThenCallableDoesntThrowsItIfGetIsNotCalled(){
        FactorialTask task = new FactorialTask(-5);
        Future<Integer> future= executorService.submit(task);
        assertEquals(false,future.isDone());
    }

    @After
    public void cleanup(){
        executorService.shutdown();
    }
}
