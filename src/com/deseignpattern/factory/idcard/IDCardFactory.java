package com.deseignpattern.factory.idcard;
import com.deseignpattern.factory.framework.*;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author mnitta
 */

public class IDCardFactory extends Factory {
    private HashMap database = new HashMap();
    private int serialNumber = 100;
    protected Product createProduct(final String owner) {
        return new IDCard(owner, serialNumber++);
    }
    protected void registerProduct(final Product product) {
        database.put((((IDCard)product).getNumber()), ((IDCard)product).getOwner());
    }
    public HashMap getOwners() {
        return database;
    }
}
