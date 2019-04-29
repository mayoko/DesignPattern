package com.deseignpattern.builder;

/**
 * @author mnitta
 */

public interface Builder {
    public abstract void makeTitle(final String title);
    public abstract void makeString(final String string);
    public abstract void makeItems(final String[] items);
    public abstract void close();
}
