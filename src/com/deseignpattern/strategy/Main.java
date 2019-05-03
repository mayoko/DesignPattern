package com.deseignpattern.strategy;

/**
 * @author mnitta
 */

public class Main {
    public static void main(String[] args) {
        final Player player1 = new Player("mayoko", new RandomStrategy());
        final Player player2 = new Player("mayomayo", new ProbStrategy());
        for (int i = 0; i < 10000; i++) {
            final Hand nextHand1 = player1.nextHand();
            final Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (nextHand1.isWeakerThan(nextHand2)) {
                System.out.println("Winner: " + player2);
                player2.win();
                player1.lose();
            } else {
                System.out.println("Draw!");
                player1.draw();
                player2.draw();
            }
        }
        System.out.println("Total Result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
