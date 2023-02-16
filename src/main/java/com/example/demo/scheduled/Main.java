package com.example.demo.scheduled;

import java.time.LocalDateTime;

/**
 * packageName    : com.example.demo.scheduled
 * fileName       : Main
 * author         : aran
 * date           : 2023/02/15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/16        aran           최초 생성
 */
public class Main {

//        LocalDateTime startTime = LocalDateTime.now();
//        System.out.println("startTime: " + startTime);
//
//        new Thread(new TestThread("5초마다 출력", 1000*5, true) {
//            @Override
//            public void callback(String result) {
//                System.out.println(LocalDateTime.now()  + ":" + Thread.currentThread().getName() + " -> " +result);
//            }
//        }).start();
//
//        new Thread(new TestThread("2초마다 출력", 1000*2, true) {
//            @Override
//            public void callback(String result) {
//                System.out.println(LocalDateTime.now()  + ":" + Thread.currentThread().getName() + " -> " +result);
//            }
//        }).start();
//
//        new Thread(new TestThread("3초마다 출력", 1000*3, false) {
//            @Override
//            public void callback(String result) {
//                System.out.println(LocalDateTime.now() + ":" + Thread.currentThread().getName() + " -> " +result);
//            }
//        }).start();

    public void RegistCronJob(String message, long milliseconds, boolean repeat){

        new Thread(new MySchedulerRunnable(message, milliseconds, repeat) {
            @Override
            public void callback(String result) {
                System.out.println(LocalDateTime.now() + ":" + Thread.currentThread().getName() + " -> " +result);
            }
        }).start();
    }

    // callback -> 성공, 실패 여부
    // cashthreadpool
    // git

    // lock
    // retry


    //



}
