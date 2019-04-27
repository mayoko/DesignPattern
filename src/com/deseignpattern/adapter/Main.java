package com.deseignpattern.adapter;

/**
 * @author mnitta
 */

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
