package com.demo.thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by simpletour_Jenkin on 2016/3/22.
 */
public class Worker extends Thread {
    private volatile boolean quittingTime = false;
    private final Object lock = new Object();
    public void run(){
        while(!quittingTime){
            pretendToWork();
        }
        System.out.println("Beer is good");
    }

    private void pretendToWork(){
        try{
            Thread.sleep(300);
        }catch (InterruptedException ex){}
    }

    void quit() throws InterruptedException{
        synchronized(lock) {
            quittingTime = true;
            join();
        }
    }

    void keepWorking(){
        synchronized(lock) {
            quittingTime = false;
        }
    }

    public static void main(String[] args)throws InterruptedException{
        final Worker worker = new Worker();
        worker.start();
        Timer t = new Timer(true);
        t.schedule(new TimerTask() {
            @Override
            public void run() { worker.keepWorking();}
        },500);
        Thread.sleep(400);
        worker.quit();
    }

}
