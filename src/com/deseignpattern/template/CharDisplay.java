package com.deseignpattern.template;

/**
 * @author mnitta
 */

public class CharDisplay extends AbstractDisplay {
    private char ch;
    public CharDisplay(final char ch) {
        this.ch = ch;
    }
    public void open() {
        System.out.print("<<");
    }
    public void print() {
        System.out.print(ch);
    }
    public void close() {
        System.out.println(">>");
    }
}
