package com.deseignpattern.prototype.framework;

/**
 * @author mnitta
 */

public abstract class Product implements Cloneable {
    public abstract void use(final String string);
    final Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
