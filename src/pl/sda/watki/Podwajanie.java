package pl.sda.watki;

import java.util.Random;

public class Podwajanie extends Thread{

@Override
public void run(){

    Random random = new Random();

    int i = random.nextInt(50);

    for (int j=1; j<=i; j++) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(j + " razy 2 = " + j * 2 + " thread: " + Thread.currentThread().getId());
    }
}



}
