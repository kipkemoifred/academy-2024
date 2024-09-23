package oop;
/*
* Threads allows a program to operate more efficiently by doing multiple things at the same time.

Threads can be used to perform complicated tasks in the background without interrupting the main program.
* */

public class Threads extends Thread {
    public static int amount = 0;
    public static void main(String[] args) {
        System.out.println("=====================extending thread class===========================");
        MainT thread = new MainT();
        thread.start();
        System.out.println("This code is outside of the thread");
        System.out.println("=====================implementing runnable interface===========================");
        MainR obj = new MainR();
        Thread threadR = new Thread(obj);
        threadR.start();
        System.out.println("This code is outside of the thread");
        System.out.println("=======================concurrency issues=========================");
        System.out.println(amount);
        amount++;
        System.out.println(amount);

        System.out.println("=======================fixing concurrency issues using isAlive()=========================");

        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);


    }
    public void run() {
        System.out.println("This code is running in a thread");
        amount++;
    }


}
 class MainT extends Thread {
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
 class MainR implements Runnable {
    public void run() {
        System.out.println("This code is running in a thread");
    }
}