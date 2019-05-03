package com.deseignpattern.bridge;

import java.util.Random;

/**
 * @author mnitta
 */

public class RandomDisplay extends CountDisplay {
    public RandomDisplay(final DisplayImpl displayImpl) {
        super(displayImpl);
    }
    void randomDisplay(final int times) {
        multiDisplay((int) Math.round(Math.random() * times));
    }
}
