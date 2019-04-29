package com.deseignpattern.builder;

/**
 * @author mnitta
 */

public class Director {
    private Builder builder;
    public Director(final Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("From morning to noon");
        builder.makeItems(new String[] {
                "Good morning",
                "Good afternoon",
        });
        builder.makeString("At evening");
        builder.makeItems(new String[] {
                "Good evening",
                "Good night",
                "Good bye",
        });
        builder.close();
    }
}
