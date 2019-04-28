package com.deseignpattern.singleton;

/**
 * @author mnitta
 */

public class Singleton {
    private static Singleton singleton = new Singleton();
    private int ticket = 0;
    private Singleton() {
        System.out.println("Instance is generated.");
    }
    public static Singleton getInstance() {
        return singleton;
    }
    public int getNextTicketNumber() {
        return ticket++;
    }
}
