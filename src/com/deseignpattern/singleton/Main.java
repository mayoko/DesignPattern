package com.deseignpattern.singleton;

/**
 * @author mnitta
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        assert(obj1 == obj2);
        System.out.println("End");

        Triple triple1 = Triple.getInstance(0);
        Triple triple2 = Triple.getInstance(1);
        assert(triple1 != null);
        assert(triple2 != null);
    }
}
