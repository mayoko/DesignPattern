package com.deseignpattern.abstractFactory.factory;

/**
 * @author mnitta
 */

public abstract class Item {
    protected String caption;
    public Item(final String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
