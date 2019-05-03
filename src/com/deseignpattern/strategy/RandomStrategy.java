package com.deseignpattern.strategy;

/**
 * @author mnitta
 */

public class RandomStrategy implements Strategy {
    public Hand nextHand() {
        final int bid = (int) Math.floor(Math.random() * 3);
        return Hand.getHand(bid);
    }
    public void study(final boolean win) {}
}
