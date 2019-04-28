package com.deseignpattern.singleton;

/**
 * @author mnitta
 */

public class Triple {
    private static Triple[] triples = new Triple[] {
        new Triple(),
        new Triple(),
        new Triple(),
    };
    private Triple() { }
    public static Triple getInstance(final int index) {
        if (index < 0 || index >= 3) return null;
        if (triples[index] == null) {
            triples[index] = new Triple();
        }
        return triples[index];
    }
}
