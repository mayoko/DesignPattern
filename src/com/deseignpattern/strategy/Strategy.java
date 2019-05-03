package com.deseignpattern.strategy;

/**
 * @author mnitta
 */

public interface Strategy {
    Hand nextHand();
    void study(final boolean win);
}
