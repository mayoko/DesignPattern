package com.deseignpattern.strategy;

/**
 * @author mnitta
 */

public class WinningStrategy implements Strategy {
    private boolean won = false;
    private Hand prevHand;
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand((int) Math.floor(Math.random() * 3));
        }
        return prevHand;
    }
    public void study(final boolean win) {
        won = win;
    }
}
