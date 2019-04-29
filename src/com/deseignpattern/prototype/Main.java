package com.deseignpattern.prototype;
import com.deseignpattern.prototype.framework.*;

/**
 * @author mnitta
 */

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", underlinePen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        final Product p1 = manager.create("strong message");
        p1.use("Hello, World");
        final Product p2 = manager.create("warning box");
        p2.use("Hello, World");
        final Product p3 = manager.create("slash box");
        p3.use("Hello, World");
    }
}
