package com.deseignpattern.bridge;

/**
 * @author mnitta
 */

public class Main {
    public static void main(String[] args) {
        final Display d1 = new Display(new StringDisplayImpl("Hello, Japan"));
        final Display d2 = new Display(new StringDisplayImpl("Hello, World"));
        final CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe"));
        final RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello, Random"));

        final String basePath = "./src/com/deseignpattern/bridge";
        final Display d5 = new Display(new FileDisplayImpl(basePath + "/file.txt"));

        final IncreasingDisplay d6 = new IncreasingDisplay(new PatternDisplayImpl('<', '*', '>'), 5);

        d1.display();
        d2.display();
        d3.multiDisplay(5);
        d4.randomDisplay(10);
        d5.display();
        d6.increasingDisplay();
    }
}
