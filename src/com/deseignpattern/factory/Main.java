package com.deseignpattern.factory;
import com.deseignpattern.factory.framework.*;
import com.deseignpattern.factory.idcard.*;

/**
 * @author mnitta
 */

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("mayoko");
        Product card2 = factory.create("mayomayo");
        Product card3 = factory.create("poyo");
        card1.use();
        card2.use();
        card3.use();
    }
}
