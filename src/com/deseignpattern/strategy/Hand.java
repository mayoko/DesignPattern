package com.deseignpattern.strategy;

/**
 * @author mnitta
 */

public class Hand {
    public static final int HANDVALUE_ROCK = 0;
    public static final int HANDVALUE_SCISSOR = 1;
    public static final int HANDVALUE_PAPER = 2;
    public static final Hand[] hand = {
            new Hand(HANDVALUE_ROCK),
            new Hand(HANDVALUE_SCISSOR),
            new Hand(HANDVALUE_PAPER),
    };
    private static final String[] name = {
            "Rock", "Scissor", "Paper"
    };
    private int handValue;
    private Hand(final int handValue) {
        this.handValue = handValue;
    }
    public static Hand getHand(final int handValue) {
        return hand[handValue];
    }
    public boolean isStrongerThan(final Hand h) {
        return fight(h) == 1;
    }
    public boolean isWeakerThan(final Hand h) {
        return fight(h) == -1;
    }
    private int fight(final Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }
    public String toString() {
        return name[handValue];
    }
}
