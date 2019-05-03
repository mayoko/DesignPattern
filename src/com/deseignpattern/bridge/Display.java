package com.deseignpattern.bridge;

/**
 * @author mnitta
 */

public class Display {
    private DisplayImpl displayImpl;
    public Display(final DisplayImpl displayImpl) {
        this.displayImpl = displayImpl;
    }
    public void open() {
        displayImpl.rawOpen();
    }
    public void print() {
        displayImpl.rawPrint();
    }
    public void close() {
        displayImpl.rawClose();
    }
    public final void display() {
        open();
        print();
        close();
    }
}
