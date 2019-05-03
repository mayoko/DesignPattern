package com.deseignpattern.strategy;

/**
 * @author mnitta
 */

public class Player {
    private String name;
    private Strategy strategy;
    private int winCount = 0;
    private int loseCount = 0;
    private int gameCount = 0;
    public Player(final String name, final Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }
    public Hand nextHand() {
        return strategy.nextHand();
    }
    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }
    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }
    public void draw() {
        gameCount++;
    }
    public String toString() {
        return "[" + name  + ":" + gameCount + " games, " + winCount + " win, " + loseCount + " lose" + "]";
    }
}
