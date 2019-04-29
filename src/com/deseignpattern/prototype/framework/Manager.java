package com.deseignpattern.prototype.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mnitta
 */

public class Manager {
    private Map<String, Product> showcase = new HashMap<>();
    public void register(final String name, Product product) {
        showcase.put(name, product);
    }
    public Product create(final String name) {
        Product p = showcase.get(name);
        return p.createClone();
    }
}
