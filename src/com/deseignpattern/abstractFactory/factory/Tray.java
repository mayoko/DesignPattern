package com.deseignpattern.abstractFactory.factory;

import java.util.ArrayList;

/**
 * @author mnitta
 */

public abstract class Tray extends Item {
    protected java.util.List<Item> tray = new ArrayList<>();
    public Tray(final String caption) {
        super(caption);
    }
    public void add(final Item item) {
        tray.add(item);
    }
}
