package com.example.demo.scheduled;

import org.junit.jupiter.api.Test;

/**
 * packageName    : com.example.demo.scheduled
 * fileName       : TestThread
 * author         : aran
 * date           : 2023/02/16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/16        aran           최초 생성
 */
public class MySchedulerThreadTest {

    @Test
    public void register() throws InterruptedException{
        MySchedulerExecutor t = new MySchedulerExecutor();
        t.execute("2초마다", 1000*2, true);

        MySchedulerExecutor t2 = new MySchedulerExecutor();
        t2. execute("7초마다", 1000*7, false);

        Thread.sleep(10000*5 );
    }

}
