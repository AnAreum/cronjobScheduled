package com.example.demo.scheduled;

import java.time.LocalDateTime;

/**
 * packageName    : com.example.demo.scheduled
 * fileName       : MySchedulerExecutor
 * author         : aran
 * date           : 2023/02/15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/16        aran           최초 생성
 */
public class MySchedulerExecutor {

    public void execute(String message, long milliseconds, boolean repeat){
        MySchedulerRunnable r = new MySchedulerRunnable(message, milliseconds, repeat) {
            @Override
            public void callback(String result) {
                System.out.println(LocalDateTime.now() + ":" + Thread.currentThread().getName() + " -> " +result);
            }
        };
        Thread t = new Thread(r);
        t.start();
    }

}
