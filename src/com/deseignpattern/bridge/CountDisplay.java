package com.deseignpattern.bridge;

/**
 * @author mnitta
 */

public class CountDisplay extends Display {
    public CountDisplay(final DisplayImpl displayImpl) {
        super(displayImpl);
    }
    public void multiDisplay(final int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
