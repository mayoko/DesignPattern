package com.deseignpattern.factory.framework;

/**
 * @author mnitta
 */

public abstract class Factory {
    public final Product create(final String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(final String owner);
    protected abstract void registerProduct(final Product product);
}
