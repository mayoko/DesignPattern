package com.deseignpattern.factory.idcard;
import com.deseignpattern.factory.framework.*;

/**
 * @author mnitta
 */

public class IDCard extends Product {
    private final String owner;
    private final int number;
    IDCard(final String owner, int number) {
        System.out.println(owner + ": " + number + " のカードを作ります");
        this.owner = owner;
        this.number = number;
    }
    public void use() {
        System.out.println(owner + ": " + number + " のカードを使います");
    }
    public String getOwner() {
        return owner;
    }
    public int getNumber() {
        return number;
    }
}
