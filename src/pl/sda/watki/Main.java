package pl.sda.watki;

import java.util.Random;

class Runner implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<50; i++){
            System.out.println("Hello: " + i + " thread: " + Thread.currentThread().getName());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
//        Thread thread = new Thread(new Runner());
//        Thread thread1 = new Thread(new Runner());
//        thread.start();
//        thread1.start();

//        RunnerExample runnerExample =  new RunnerExample();
//        RunnerExample runnerExample1 = new RunnerExample();
//        runnerExample.start();
//        runnerExample1.start();
//        System.out.println("---------------");

        Thread thread =  new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<10; i++){
                    System.out.println("Hello: " + i + " thread: " + Thread.currentThread().getName());
                }
            }
        });

//        thread.start();

        System.out.println();

        Podwajanie podwajanie = new Podwajanie();
        Podwajanie podwajanie1 =  new Podwajanie();

        podwajanie.start();
        podwajanie1.start();

    }
}
