package com.example.demo.scheduled;

import java.util.concurrent.CompletableFuture;

/**
 * packageName    : com.example.demo.scheduled
 * fileName       : Thread
 * author         : aran
 * date           : 2023/02/15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/16        aran           최초 생성
 */
public abstract class MySchedulerRunnable implements Runnable{
    private String message;
    private long milliseconds;
    private boolean repeat;

    public MySchedulerRunnable(String message, long milliseconds, boolean repeat) {
        this.message = message;
        this.milliseconds = milliseconds;
        this.repeat = repeat;
    }

    public void task() {
        do{
            makeCompletableFuture();
        }while(repeat);
    }

    private void makeCompletableFuture(){
        try{
            Thread.sleep(milliseconds);
            CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync( () -> {
                return String.format("[%s: %s]", Thread.currentThread().getName(), message);
            });
            callback(completableFuture.join());
        }catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void run() {
        task();
    }
    public abstract void callback(String result);
}
