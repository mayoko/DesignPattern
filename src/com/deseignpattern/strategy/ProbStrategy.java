package com.deseignpattern.strategy;

/**
 * @author mnitta
 */

public class ProbStrategy implements Strategy {
    private int prevHandValue = 0;
    private int currentHandValue = 0;
    private int[][] history;
    public ProbStrategy() {
        history = new int[3][];
        for (int i = 0; i < 3; i++) {
            history[i] = new int[3];
            for (int j = 0; j < 3; j++) {
                history[i][j] = 1;
            }
        }
    }
    public Hand nextHand() {
        final int bet = (int) Math.floor(Math.random() * getSum(currentHandValue));
        int handValue = 0;
        if (bet < history[currentHandValue][0]) {
            handValue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handValue = 1;
        } else {
            handValue = 2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handValue;
        return Hand.getHand(handValue);
    }
    private int getSum(final int hv) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[hv][i];
        }
        return sum;
    }
    public void study(final boolean win) {
        if (win) {
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
