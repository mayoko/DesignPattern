package com.deseignpattern.bridge;

import java.util.zip.CheckedOutputStream;

/**
 * @author mnitta
 */

public class IncreasingDisplay extends CountDisplay {
    private final int times;
    public IncreasingDisplay(final DisplayImpl displayImpl, final int times) {
        super(displayImpl);
        this.times = times;
    }
    public void increasingDisplay() {
        for (int i = 0; i < times; i++) {
            multiDisplay(i);
        }
    }
}
