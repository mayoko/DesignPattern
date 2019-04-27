package com.deseignpattern.adapter;

/**
 * @author mnitta
 */

public class Banner {
    private String string;
    public Banner(final String string) {
        this.string = string;
    }
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
