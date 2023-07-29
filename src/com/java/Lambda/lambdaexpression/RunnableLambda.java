package com.java.Lambda.lambdaexpression;

class ThredEx implements Runnable{

    @Override
    public void run() {
        System.out.println("This thread is runnig heyy");
    }
}

public class RunnableLambda {
    public static void main(String[] args) {

        Thread t = new Thread(new ThredEx());
        t.start();

        Runnable run = ()->{
            System.out.println("This thread is running.");
        };
        Thread t2 = new Thread(run);
        t2.start();

        Thread t3 = new Thread(()-> System.out.println("This thread is runnig as parameter."));
        t3.start();
    }


}
